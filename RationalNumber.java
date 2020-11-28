public class RationalNumber extends Number{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super();
    if(deno < 0){
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return (double)numerator/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber reversed = new RationalNumber(denominator, numerator);
    return reversed;
  }

  public boolean equals(RationalNumber other){
    reduce();
    other.reduce();
    if(getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator()){
      return true;
    }
    return false;
  }

  public String toString(){
    reduce();
    if(denominator < 0){
      numerator = numerator * -1;
      denominator = denominator * -1;
    }
    return "" + numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    while (b != 0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  private void reduce(){
    int factor = gcd(getNumerator(), getDenominator());
    numerator = getNumerator() / factor;
    denominator = getDenominator() / factor;
  }

  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(getNumerator()*other.getNumerator(), getDenominator()*other.getDenominator());
    product.reduce();
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(getNumerator()*other.getDenominator(), getDenominator()*other.getNumerator());
    quotient.reduce();
    return quotient;
  }

  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber(getNumerator()*other.getDenominator() + other.getNumerator() * getDenominator(), getDenominator() * other.getDenominator());
    sum.reduce();
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    RationalNumber difference = new RationalNumber(getNumerator()*other.getDenominator() - other.getNumerator() * getDenominator(), getDenominator() * other.getDenominator());
    difference.reduce();
    return difference;
  }

}
