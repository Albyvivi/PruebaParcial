package com.example.pruebaparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.pruebaparcial.connectors.RetrofitInstance;
import com.example.pruebaparcial.model.DigimonModel;
import com.example.pruebaparcial.view.GameAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRcv;

    private List<DigimonModel> games;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainRcv = findViewById(R.id.mainRcv);
        mainRcv.setLayoutManager(new LinearLayoutManager(this));
        RetrofitInstance.getInstance().getApIinterface().getGames().enqueue(new Callback<List<DigimonModel>>() {
            @Override
            public void onResponse(@NonNull Call<List<DigimonModel>> call, @NonNull Response<List<DigimonModel>> response) {
                games = response.body();
                mainRcv.setAdapter(new GameAdapter(getApplicationContext(), games));
            }

            @Override
            public void onFailure(@NonNull Call<List<DigimonModel>> call, @NonNull Throwable t) {
                Log.e("API", "onFailure:" + t.getLocalizedMessage());
            }
        });
    }
}