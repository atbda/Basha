/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springcollectionvaluein;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MRuser
 */
public class SpringCollection {
 List AddressList;
 Set  AddressSet;
 Map  AddressMap;

    public List getAddressList() {

      
        return AddressList;
        
    }

    public void setAddressList(List AddressList) {
        this.AddressList = AddressList;
    }

    public Set getAddressSet() {
       
        return AddressSet;
    }

    public void setAddressSet(Set AddressSet) {
        this.AddressSet = AddressSet;
    }

    public Map getAddressMap() {
     
        return AddressMap;
    }

    public void setAddressMap(Map AddressMap) {
        this.AddressMap = AddressMap;
    }
    
}
