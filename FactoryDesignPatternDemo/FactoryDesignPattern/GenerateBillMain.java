package FactoryDesignPattern;
import com.plans.GetPlanFactory;
import com.plans.Plan;
import com.plans.CommercialPlan;
import com.plans.DomesticPlan;
import com.plans.InstitutionalPlan;
import java.io.*; 


public class GenerateBillMain{  
    public static void main(String args[])throws IOException{ 
    	
      GetPlanFactory planFactory = new GetPlanFactory();  
      
      //get the input
      System.out.print("Enter the name of plan for which the bill will be generated(domesticplan,commercialplan or institutionalplan): ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      String planName=br.readLine();  

  
      Plan p = planFactory.getPlan(planName);  
      p.getRate();


            }  
    }//end of GenerateBill class.  