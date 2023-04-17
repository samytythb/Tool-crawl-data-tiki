package com.example.CrawlerTool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CrawlTool {
    public  void tool(int page ) {
        String url = "https://tiki.vn/api/personalish/v1/blocks/listings?limit=12&include=advertisement&is_mweb=1&aggregations=2&trackity_id=6bc4e7d7-cc2e-07b9-4df8-05dc6a00375d&urlKey=dien-thoai-may-tinh-bang&categoryId=1789&category=1789&page="+String.valueOf(page);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            String jsonData = response.body().string();
            System.out.println(jsonData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
