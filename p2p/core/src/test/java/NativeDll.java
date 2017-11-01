
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/**
 * @Project : p2p
 * @Package Name : PACKAGE_NAME
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月30日 14:38
 * @ModificationHistory Who When   What
 */
public class NativeDll {
    public interface CLibrary extends Library{
        CLibrary Instance = Native.loadLibrary((Platform.isWindows()?" ":"c"),CLibrary.class);

        void printf(String format,Object... args);
    }
    public static void main(String... args) {
        CLibrary.Instance.printf("");
    }
}
