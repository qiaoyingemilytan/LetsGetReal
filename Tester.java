public class Tester{
  public static void main(String[] args){
    RealNumber one = new RealNumber(1);
    RealNumber alsoOne = new RealNumber(4);
    RationalNumber number = new RationalNumber(2,4);
    RationalNumber other = new RationalNumber(2,1);
    System.out.println(one.equals(alsoOne));
    System.out.println(one.add(alsoOne).toString());
    System.out.println(one.multiply(alsoOne).toString());
    System.out.println(one.subtract(alsoOne).toString());
    System.out.println(one.divide(alsoOne).toString());
    System.out.println(number.getNumerator());
    System.out.println(number.getDenominator());
    System.out.println(number.reciprocal().getNumerator());
    System.out.println(number.reciprocal().getDenominator());
    System.out.println(number.multiply(other).getNumerator());
    System.out.println(number.multiply(other).getDenominator());
    System.out.println(number.divide(other).getNumerator());
    System.out.println(number.divide(other).getDenominator());
    System.out.println(number.add(other).getNumerator());
    System.out.println(number.add(other).getDenominator());
    System.out.println(number.subtract(other).getNumerator());
    System.out.println(number.subtract(other).getDenominator());
  }
}
