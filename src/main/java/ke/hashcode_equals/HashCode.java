package ke.hashcode_equals;

public class HashCode {
    int varA;
    int varB;

    public HashCode(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public static void main(String[] args) {
        String o = "Oleg 1";
        System.out.println(new HashCode(11, 20).hashCode());
        System.out.println(new HashCode(11, 20).hashCode());

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        HashCode other = (HashCode) obj;
//        if (varA != other.varA)
//            return false;
//        if (varB != other.varB)
//            return false;
//        return true;
//    }
}