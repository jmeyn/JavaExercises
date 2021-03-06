
package restaurantclient;

public class Store {
    private String storeName;
    public static final double TAX_RATE = 0.06;
    
    public Store( String newStoreName ) {
        
        setName( newStoreName );
    
    }
    
    public String getName( ) {
        
        return this.storeName;
       
    }
    
    public void setName( String newStoreName ) {

        this.storeName = newStoreName;
        
    }
    
    public double getTaxRate( ) {
        
        return this.TAX_RATE;
        
    }
    
    @Override
    public String toString( ) {
        
        return "Store Name: " + getName();
        
    }
    
    public boolean equals( Store otherStore ) {
        
        return ( this.getName().equals( otherStore.getName() ) );
        
    }

}
