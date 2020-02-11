/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Employee.Employee;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.AdminRole;
import java.util.ArrayList;
/**
 *
 * @author prima
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public void deleteNetwork(Network network){
        //this.networkList.remove(network);
        this.getNetworkList().remove(network);
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    public boolean checkIfNetworkIsUnique(String NetworkName, String Location){
        for (Network network : this.networkList){
            if (
                 (network.getName().equals(NetworkName)) && (network.getLocation().equals(Location))
                )
                return false;
        }
        return true;
    }
    
    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
}