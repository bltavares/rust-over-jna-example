package datrs.hypercore;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class Hypercore {
    public interface HypercoreFFI extends Library {
        HypercoreFFI INSTANCE = (HypercoreFFI) Native.loadLibrary("hypercore", HypercoreFFI.class);

        int banana();
    }
}