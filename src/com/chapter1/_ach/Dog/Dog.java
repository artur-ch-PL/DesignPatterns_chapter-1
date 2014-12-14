package com.chapter1._ach.Dog;

import com.chapter1._ach.Apport.ApportCommand;
import com.chapter1._ach.Bark.BarkBehaviour;

public abstract class Dog {
	BarkBehaviour barkBehaviour;
	ApportCommand apportCommand;
	
	public void performBark(){
		barkBehaviour.bark();
	}
	
	public void performApport(){
		apportCommand.apport();
	}
	
	public void setBarkBehaviour(BarkBehaviour bb){
		barkBehaviour = bb;
	}
	
	public void setAportCommand(ApportCommand ac){
		apportCommand = ac;		
	}
	
	
	
}
