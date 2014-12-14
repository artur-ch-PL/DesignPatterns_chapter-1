package com.chapter1._ach;

import com.chapter1._ach.Apport.ApportUK;
import com.chapter1._ach.Bark.BarkUK;
import com.chapter1._ach.Dog.Dog;
import com.chapter1._ach.Dog.ModelDog;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog model = new ModelDog();
		
		model.performBark();
		model.performApport();
		
		model.setBarkBehaviour(new BarkUK());
		model.setAportCommand(new ApportUK());
		
		model.performBark();
		model.performApport();
	}

}
