/*
 * Name : Shubham Vyas;
 * Enrollment Number : 200469159
 * */
package com.example.w22comp1011gctest2student;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApiUtility {
    public static ApiResponse getCustomerDataFromJsonFile(String fileName) {
        Gson gson = new Gson();

        //try with resources will autoclose any of the items in the ()
        try(
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            return gson.fromJson(jsonReader, ApiResponse.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
