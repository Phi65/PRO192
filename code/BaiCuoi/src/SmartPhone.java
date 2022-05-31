/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razer Blade
 */
public class SmartPhone {
    private String name;
    private PIN pin;
    
    public SmartPhone(){
        name="Samsung";
        pin=new PIN();
    }

    public SmartPhone(String name, int hour, String nsx) {
        this.name = name;
        this.pin=new PIN(hour,nsx);
    }

    @Override
    public String toString() {
        return name + ", " + pin.getNumofhours() + ", " + pin.getMake();
    }
    
    
    class PIN{
        private int numofhours;
        private String make;

        public PIN() {
            numofhours=10;
            make="China";
        }

        public PIN(int numofhours, String make) {
            this.numofhours = numofhours;
            this.make = make;
        }
        
        public int getNumofhours() {
            return numofhours;
        }

        public void setNumofhours(int numofhours) {
            this.numofhours = numofhours;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }
        
    }
}
