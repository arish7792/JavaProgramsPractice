private static String gmailActivation(String regex,String email, String password){
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        String confirmURL = null;
        try {

            Store store = session.getStore("imaps");
            store.connect("imap.gmail.com", email, password);
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_WRITE);
            Message messages[] = folder.getMessages();
            Thread.sleep(10000);

            boolean isMailFound = false;
            Message mailregistration = null;

            for (int i = 0; i < 10; i++) {
                messages = folder.search(new SubjectTerm("Email Subject"),
                        folder.getMessages());
                // Wait for 5 seconds
                if (messages.length == 0) {
                    Thread.sleep(5000);
                }
            }

            for (Message mail : messages) {
                if (!mail.isSet(Flags.Flag.SEEN)) {
                    mailregistration = mail;
                    isMailFound = true;
                }
            }

            // Test fails if no unread mail was found from God
            if (!isMailFound) {
                throw new Exception("Could not find new mail for Registartion ");
                // email contents add to file
            }
            System.out.println("Email received: ");
            System.out.println("---------------------------------");
            System.out.println("Subject: " + mailregistration.getSubject());
            System.out.println("From: " + mailregistration.getFrom()[0]);
            System.out.println("Date " + mailregistration.getReceivedDate());
            File file = new File(".\\newfile.txt");
            FileOutputStream fop = new FileOutputStream(file);
            mailregistration.writeTo(fop);

            // Extract URL
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(new FileInputStream(".\\newfile.txt"), "UTF8"));

            Pattern p = Pattern.compile(regex);
            String l;
            while ((l = inputStream.readLine()) != null) {
                Matcher m = p.matcher(l);
                if (m.find()) {
                    confirmURL = m.group(2);
                    break;
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return confirmURL;
    }
