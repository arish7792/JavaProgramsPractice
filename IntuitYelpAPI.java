package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class IntuitYelpAPI {

	public static void main(String[] args) throws MalformedURLException {
		try {

			URL url = new URL("https://api.yelp.com/v3/businesses/search?location=Sunnyvale&radius=100&sort_by=review_count&limit=1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer "+"1zynhUfpqVLB5mJ81mIHs5SI2v7ZzKmGTDz_HSa6tt8XntpmOtVIPTaxXe46xU1DdkeDozZDpKUyWk6RM3XTq5HSl_wt56sCvFCjKADYSe5eQ0ByK9cnOxHt4VXEXXYx");
			

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			StringBuffer response = new StringBuffer();
			
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				response.append(output);
			}
			
			System.out.println(response);
			
			JSONObject jsonObj = new JSONObject(response.toString());
			System.out.println(jsonObj);
			
			//System.out.println(response);					
			conn.disconnect();
			
			
			

			
		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

}
