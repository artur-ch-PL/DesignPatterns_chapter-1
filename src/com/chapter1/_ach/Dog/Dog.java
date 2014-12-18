package com.chapter1._ach.Dog;

import com.chapter1._ach.Apport.IApportCommand;
import com.chapter1._ach.Bark.IBarkBehaviour;

public abstract class Dog {
	IBarkBehaviour barkBehaviour;
	IApportCommand apportCommand;
	
	public void performBark(){
		barkBehaviour.bark();
	}
	
	public void performApport(){
		apportCommand.apport();
	}
	
	public void setBarkBehaviour(IBarkBehaviour bb){
		barkBehaviour = bb;
	}
	
	public void setAportCommand(IApportCommand ac){
		apportCommand = ac;		
	}
	
	
	
}
