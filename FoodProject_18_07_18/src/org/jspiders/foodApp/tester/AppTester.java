package org.jspiders.foodApp.tester;
import org.jspiders.foodApp.dao.FoodDAO;
import org.jspiders.foodApp.dto.FoodDTO;
public class AppTester {
	public static void main(String[] args) {
		/*FoodDTO foodDTO = new FoodDTO();
		foodDTO.setFoodId(3);
		foodDTO.setName("Biriyani");
		foodDTO.setPrice(160.00);
		foodDTO.setQuantity(70);
		foodDTO.setType("NonVeg");
		
		FoodDAO foodDAO = new FoodDAO();
		foodDAO.saveFood(foodDTO);*/
		
		
		/*FoodDAO foodDAO = new FoodDAO();
		FoodDTO foodDTO = foodDAO.getFoodById(2);
		
		System.out.println("Food Name: " + foodDTO.getName());
		System.out.println("Food Price: " + foodDTO.getPrice());*/

		FoodDAO foodDAO = new FoodDAO();
		foodDAO.UpdateFoodPriceById(2, 55.00);
	}

}
