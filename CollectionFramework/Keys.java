package CollectionFramework;

public class Keys {
    int k;

    public Keys(int k) {
        super();
        this.k = k;
    }

    public Keys() {
        super();
    }

    
    
    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    
    
    
    @Override
    public String toString() {
        return "Keys [k=" + k + "]";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(k); // Generates hash code based on the price
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class
        Keys other = (Keys) obj;
        return k == other.k; // Compare prices for equality
    }
}
