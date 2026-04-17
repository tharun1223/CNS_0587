import java.math.BigInteger;
import java.util.Scanner;
public class RSAexample{
           public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           //step1-choose two prime numbers
           System.out.print("Enter prime number p: ");
           BigInteger p=sc.nextBigInteger();
           System.out.print("Enter prime number q: ");
           BigInteger q=sc.nextBigInteger();
           //step2:Compute n=p*q
           BigInteger n=p.multiply(q);
           //step3:Compute phi(n)=(p-1)*(q-1)
           BigInteger phi=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
           //step4:choose e(public key component)
           System.out.print("Enter public key e: ");
           BigInteger e= sc.nextBigInteger();
           //step5:Compute d(private key exponent)
           BigInteger d=e.modInverse(phi);
           System.out.println("\nPublic Key(e,n): ("+e+","+n+")");
           System.out.println("Private Key(d,n): ("+d+","+n+")");
           //step6:Encryption
           System.out.print("\nEnter message(number): ");
           BigInteger message=sc.nextBigInteger();
           BigInteger cipher=message.modPow(e,n);
           System.out.println("Encrypted message:"+cipher);
           //step7: Decryption
           BigInteger decrypted=cipher.modPow(d,n);
           System.out.println("Decrypted message:"+decrypted);
           sc.close();
       }
}
       