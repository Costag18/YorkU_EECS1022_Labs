package lab6;

//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Constantinos Giannaras
//Yorku Email : costag@my.yorku.ca
//Date : 2024, 03, 24
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Order {
    private Child[] childList;
    
    public Order() {
        this.childList = new Child[0];
    }
    public int getNumofChilds() {
        return childList.length;
    }
    public String toString(){
    	return String.format("The order contains %d Childs", this.getNumofChilds());
    }
    public Child[] getChilds() {
        return childList;
    }
    
    public void addChildtoOrder(Child c) {
    	if (childList.length <5) {
	        Child[] newArray = new Child[childList.length + 1];
	        System.arraycopy(childList, 0, newArray, 0, childList.length);
	        newArray[childList.length] = c;
	        childList = newArray;
    	}
    }
    
    public void removeChildfromOrder(Child c) {
        int index = -1;
        for (int i = 0; i < childList.length; i++) {
            if (childList[i] == c) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Child[] newArray = new Child[childList.length - 1];
            System.arraycopy(childList, 0, newArray, 0, index);
            System.arraycopy(childList, index + 1, newArray, index, childList.length - index - 1);
            childList = newArray;
        }
    }
}



class Child {
    private String name;
    private int age;
    private Toy[] toys;
    
    public Child(String name, int age, Toy[] toys) {
        this.name = name;
        this.age = age;
        if (toys != null) {
            this.toys = new Toy[toys.length];
            for (int i = 0; i < toys.length; i++) {
                this.toys[i] = new Toy(toys[i].getToyID(), toys[i].getToyName(),
                        toys[i].getToyQuantity(), toys[i].getToyPrice());
            }
        } else {
            this.toys = null;
        }
    }
    public Child(Child c) {
        this.name = c.name;
        this.age = c.age;
        if (c.toys != null) {
            this.toys = new Toy[c.toys.length];
            for (int i = 0; i < c.toys.length; i++) {
                this.toys[i] = new Toy(c.toys[i].getToyID(), c.toys[i].getToyName(),
                        c.toys[i].getToyQuantity(), c.toys[i].getToyPrice());
            }
        } else {
            this.toys = null;
        }
    }
    public int getNumberofToys() {
        return (toys == null ? 0 : toys.length);
    }
	public int getChildAge() {
		return age;
	}
	public String getChildName() {
		return name;
	}
	public Toy[] getChildToy() {
		return toys;
	}
	public String toString() {
	    return String.format("Child [%s] of age <%d> has (%d) toys", name, age, (toys == null ? 0 : toys.length));
	}
	public void setChildName(String name) {
		this.name = name;
	}
	public void setChildAge(int age) {
		this.age = age;
	}
	public void setChildToy(Toy[] toys) {
		this.toys = toys;
	}
	public void disposeToys() {
	    this.toys = null;
	}

	public void donate(Child c) {
	    if (c != this) {
	        int csToyLength = c.getNumberofToys();
	        Toy[] combinedToys = new Toy[csToyLength + this.getNumberofToys()];
	        for (int i = 0; i < csToyLength; i++) {
	            combinedToys[i] = new Toy(c.toys[i].getToyID(), c.toys[i].getToyName(),
	                                       c.toys[i].getToyQuantity(), c.toys[i].getToyPrice());
	        }
	        for (int i = csToyLength; i < csToyLength + this.getNumberofToys(); i++) {
	            combinedToys[i] = new Toy(this.toys[i - csToyLength].getToyID(),
	                                       this.toys[i - csToyLength].getToyName(),
	                                       this.toys[i - csToyLength].getToyQuantity(),
	                                       this.toys[i - csToyLength].getToyPrice());
	        }
	        c.setChildToy(combinedToys);
	        this.disposeToys();
	    }
	}

}



class Toy {
    private int id;
    private String name;
    private int qty;
    private double price;
    
    public Toy(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    
    public int getToyID() {
        return id;
    }
    
    public String getToyName() {
        return name;
    }
    
    public int getToyQuantity() {
        return qty;
    }
    
    public double getToyPrice() {
        return price;
    }
    
    public String getToyInformation() {
	    return String.format("Toy(%d,%s), quantity(%d) with $( %.2f)/toy", id, name, qty, price);
	}
    public void setToyID(int id) {
        this.id = id;
    }
    
    public void setToyName(String name) {
        this.name = name;
    }
    
    public void setToyQuantity(int qty) {
        this.qty = qty;
    }
    
    public void setToyPrice(double price) {
        this.price = price;
    }
}



