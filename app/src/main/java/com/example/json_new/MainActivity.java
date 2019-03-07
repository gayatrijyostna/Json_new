package com.example.json_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        String job_list = "{\n" +
                "\t\"job_list\":[\n" +
                "    {\n" +
                "\t\t\"pos_name\": \"Android Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Android, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Java Developer\",\n" +
                "\t\t\"experience\": \"1-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Spring, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \".NET Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"3 - 6 LPA\",\n" +
                "\t\t\"location\": \"Chennai\",\n" +
                "\t\t\"key_skills\": \".NET, ASP, Azure\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t},\n" +
                "\t\t{\n" +
                "\t\t\"pos_name\": \"Android Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Android, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Java Developer\",\n" +
                "\t\t\"experience\": \"1-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Spring, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \".NET Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"3 - 6 LPA\",\n" +
                "\t\t\"location\": \"Chennai\",\n" +
                "\t\t\"key_skills\": \".NET, ASP, Azure\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Android Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Android, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Java Developer\",\n" +
                "\t\t\"experience\": \"1-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Spring, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \".NET Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"3 - 6 LPA\",\n" +
                "\t\t\"location\": \"Chennai\",\n" +
                "\t\t\"key_skills\": \".NET, ASP, Azure\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Android Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Android, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \"Java Developer\",\n" +
                "\t\t\"experience\": \"1-4 years\",\n" +
                "\t\t\"sal_range\": \"2.4 - 6 LPA\",\n" +
                "\t\t\"location\": \"Hyderabad\",\n" +
                "\t\t\"key_skills\": \"Spring, java, xml\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}, {\n" +
                "\t\t\"pos_name\": \".NET Developer\",\n" +
                "\t\t\"experience\": \"2-4 years\",\n" +
                "\t\t\"sal_range\": \"3 - 6 LPA\",\n" +
                "\t\t\"location\": \"Chennai\",\n" +
                "\t\t\"key_skills\": \".NET, ASP, Azure\",\n" +
                "\t\t\"createddate\": \"2018-08-04\"\n" +
                "\t}\n" +
                " ]\n" +
                "}";
        ArrayList<Map<String,String>> al=new ArrayList<>();
        try {
            JSONObject contac =new JSONObject(job_list);
            JSONArray jobList=contac.getJSONArray("job_list");
            for(int i=0;i<jobList.length();i++) {
                Map <String, String> map = new HashMap <>();
                JSONObject con1 = jobList.getJSONObject( i );
                map.put( "name", con1.getString( "pos_name" ) );
                map.put( "exp", con1.getString( "experience" ) );
                map.put( "sal1", con1.getString( "sal_range" ) );
                map.put( "loc", con1.getString( "location" ) );
                map.put( "skills", con1.getString( "key_skills" ) );
                map.put( "date", con1.getString( "createddate" ) );
                al.add( map );

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomerAdapter customerAdapter=new CustomerAdapter(this,al);
        recyclerView.setAdapter(customerAdapter);
    }
}
