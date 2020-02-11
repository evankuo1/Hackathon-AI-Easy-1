package gameEngine;

import java.util.ArrayList;
import java.util.List;

import editMe.Player;


public class InitialBoard {
	
	int width;
	int height;
	List<ArrayList> objList;
	
	public InitialBoard() {
		
			width = 1;
			height = 5;
			objList = new ArrayList<ArrayList>();

			BoardObject player = new Player();

			ArrayList playerList = new ArrayList();
			playerList.add(0);
			playerList.add(0);
			playerList.add(player);
			objList.add(playerList);
			
			Food food = new Food();
			ArrayList foodList = new ArrayList();
			foodList.add(0);
			foodList.add(4);
			foodList.add(food);
			objList.add(foodList);
		}
	
	int getWidth() {
		return width;
	}
	
	int getHeight() {
		return height;
	}
	
	List<ArrayList> getObjList() {
		return objList;
	}
}
