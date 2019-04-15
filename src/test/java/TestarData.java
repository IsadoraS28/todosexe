import org.junit.Test;
import data.Data;

import static junit.framework.TestCase.assertEquals;


public class TestarData {

    @Test
    public void testarDataValida(){

        Data d = new Data(1, 1, 2019);
        assertEquals("Erro", "1/1/2019", d.toString());

        d = new Data(14, 10, 2021);
        assertEquals("Erro", "1/1/1970", d.toString());

        d = new Data(21, 2, 2019);
        assertEquals("Erro", "1/1/1970", d.toString());

        d = new Data(100, 1, 2019);
        assertEquals("Erro", "1/1/1970", d.toString());

        d = new Data(1, 100, 2019);
        assertEquals("Erro", "1/1/1970", d.toString());

    }

    @Test
    public void testarConvParaDias(){

        Data d = new Data(1,1,2019);
        assertEquals("Erro", 0, d.convParaDias());

        d = new Data(2,1,2019);
        assertEquals("Erro", 1, d.convParaDias());

        d = new Data(1,2,2019);
        assertEquals("Erro", 31, d.convParaDias());

        d = new Data(1,3,2019);
        assertEquals("Erro", 59, d.convParaDias());

        d = new Data(1,3,2012);
        assertEquals("Erro", 60, d.convParaDias());

    }


}
