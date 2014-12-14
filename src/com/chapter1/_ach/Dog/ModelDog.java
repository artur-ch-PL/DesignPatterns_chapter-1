package com.chapter1._ach.Dog;

import com.chapter1._ach.Apport.ApportPolish;
import com.chapter1._ach.Bark.BarkPolish;

public class ModelDog extends Dog {
	public ModelDog(){
		barkBehaviour = new BarkPolish();
		apportCommand = new ApportPolish();
	}
}
