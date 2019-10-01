import java.util.*;
public class AmazonTruckLoadingQuestion {


	    public static void main(String args[]){


	        ArrayList<Integer> a = new ArrayList<>();
	        a.add(-1);
	        a.add(10);
	        a.add(50);
	        a.add(35);
	        a.add(60);

	        new AmazonTruckLoadingQuestion().IDsOfPackages(90,a);


	        ArrayList<Integer> b = new ArrayList<>();
	        b.add(1);
	        b.add(10);
	        b.add(25);
	        b.add(35);
	        b.add(60);
	        new AmazonTruckLoadingQuestion().IDsOfPackages(90,b);

	    }

	    ArrayList<Integer> IDsOfPackages(int truckSpace,
	                                     ArrayList<Integer> packagesSpace)
	    {
	        // WRITE YOUR CODE HERE
	        int safty =30;
	        ArrayList <Integer>  pack_w_safty= new ArrayList<Integer>();
	        ArrayList <Integer> results = new ArrayList<Integer>();


	        for(int i =0; i< packagesSpace.size();i++)
	        {
	            pack_w_safty.add(truckSpace-(safty+packagesSpace.get(i)));
	        }

	        for (int ii =0;ii<pack_w_safty.size();ii++)
	        {
	            if((packagesSpace.indexOf(pack_w_safty.get(ii)))!=-1)
	            {
	                results.add(ii);

	                results.add(packagesSpace.indexOf(pack_w_safty.get(ii)));
	                break;
	            }


	        }
	        return results;
	    }
	}