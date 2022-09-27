package com.example.arjun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.arjun.entity.Food;
import com.example.arjun.exception.CategoryAlreadyExistException;
import com.example.arjun.exception.IdAlreadyExistException;
import com.example.arjun.repository.IFoodRepository;


@Service
public class IFoodService {
@Autowired
private IFoodRepository IFoodRepository;

	public List<Food> getFoodList(){
        List<Food> food;
        food = IFoodRepository.findAll();
        return food;
    }

    public Food validateFoodInfo(String productId){
        Food food = null;
        food = IFoodRepository.findById(productId).get();
        return food;
    }
    public Food getFoodById(String id)   
    {  
    return IFoodRepository.findFoodById(id); 
    }  
    
    public Food FoodId(Food food) throws IdAlreadyExistException {
    	Food foodId = IFoodRepository.findFoodById(food.getId());
    	if(foodId != null) {
    		throw new IdAlreadyExistException("Id Already Exist");
    	}
    	else {
    		IFoodRepository.save(food);
    		return food;
    	}
    }
    public Food FoodList(Food food) throws CategoryAlreadyExistException {
        Food foodlist = IFoodRepository.findByItem(food.getItem());
        if (foodlist != null) {
            throw new CategoryAlreadyExistException("Item already exist");
        } else {
            IFoodRepository.save(food);
            return food;
        }
        
    }
    public void delete(String id)   
    {  
    IFoodRepository.deleteById(id);  
    }  

}
