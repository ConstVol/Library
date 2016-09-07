/**
 * Created by Андрей on 05.09.2016.
 */
public class RandomG {

    public void randomyze(Library x){

        for( int i = 1; i <= 1000; i++){

            Book r = new Book(Long.toHexString(Double.doubleToLongBits(Math.random()*100)),
                    (int)Math.random(),
                                Long.toHexString(Double.doubleToLongBits(Math.random())), (int)Math.random(),  (int)Math.random() );

            x.addItem(r);



        }
    }

}
