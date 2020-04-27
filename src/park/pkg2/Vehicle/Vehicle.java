
package park.pkg2.Vehicle;

import java.util.Objects;

public abstract class Vehicle {
    private String licenseNumber;
    private Vehicletype type;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.licenseNumber, other.licenseNumber)) {
            return false;
        }
        
        return true;
    }

    
    

    public Vehicle(String licenseNumber, Vehicletype type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

    
    @Override
    public String toString() {
        return "Vehicle{" + "licenseNumber=" + licenseNumber + ", type=" + type + '}';
    }
    
    
}
