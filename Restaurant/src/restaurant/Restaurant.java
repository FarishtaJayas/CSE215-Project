/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Restaurant {

        public double SpicyChickenBurger;
        public double CheeseandBaconDelight;
        public double Baconator;
        public double ClassicBLT;
        public double SteakBurger;
        
        public double SaltedCaramel;
        public double ChocolateSurprise;
        public double BananaFoster;
        public double NormieDrinks;
        public double Water;
        
        
        
        public double Burgers;
        public double Shakes;
        public double TotalBS;
        
        public double GrandTotal;
        
        
        public double getAmount(){
            
           Burgers    =  SpicyChickenBurger + CheeseandBaconDelight + Baconator + ClassicBLT + SteakBurger;
           Shakes   =  SaltedCaramel + ChocolateSurprise + BananaFoster + NormieDrinks + Water;
           TotalBS = Burgers + Shakes;
           GrandTotal = TotalBS;
                   
        
            return GrandTotal;
        }
        
        private JFrame frame;
        
        public void ExitSystem(){
            frame = new JFrame("Exit");
            
            if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Management System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
        }
        
        //=======================Price======================================
        
        public double pSpicyChickenBurger = 180;
        public double pCheeseandBaconDelight = 200;
        public double pBaconator = 220;
        public double pClassicBLT = 150;
        public double pSteakBurger = 250;
        
        public double pSaltedCaramel = 80;
        public double pChocolateSurprise = 60;
        public double pBananaFoster = 110;
        public double pNormieDrinks = 25;
        public double pWater = 10;
        
        //====================================================================
        
        public double mcTax = 0.9;
        
        public double cFindTax(double cAmount){
            double FindTax = cAmount - (cAmount*mcTax);
            return FindTax;
        }
}
