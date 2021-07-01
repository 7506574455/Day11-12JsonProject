package com.inventory;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryControl {

	public static void main(String[] args) {
	
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(".//Data/inventoryDetails.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray inventory = (JSONArray) jsonObject.get("inventory");
			
			System.out.println(inventory);
			//JSONObject jsobj = (JSONObject) inventory.get(0);
			//System.out.println(jsobj);
			//Double price = (double) jsobj.get("pricePerKg");
			//System.out.println(price);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}