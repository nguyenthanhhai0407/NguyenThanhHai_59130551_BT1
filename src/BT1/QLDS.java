
package BT1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ltpnt
 */
public class QLDS implements IQLDS{
    private List<CaNhan> dsCaNhan = new ArrayList<>();

    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 0;
    }

    @Override
    public int xoa(String ten) {
        for(CaNhan caNhan: dsCaNhan) {
            if(caNhan.getHoTen().equals(ten)) {
                dsCaNhan.remove(caNhan);
            }
        }
        return 0;
    }

    @Override
    public void inDS() {
        for(CaNhan caNhan: dsCaNhan) {
           caNhan.hienThiTT();
       }
    }
        
}

