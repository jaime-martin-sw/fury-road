import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;

public enum Surface {
    ASPHALT('A', (short) 20, (short) 5),
    SAND('S', (short) 30, (short) 40);

    char abbreviation;
    short costByFoot;
    short costByScooter;

    public static final Map<Character, Surface> LOOKUP = Maps.uniqueIndex(Arrays.asList(Surface.values()), Surface::getAbbreviation);

    Surface(char abbreviation, short costByFoot, short costByScooter) {
        this.abbreviation = abbreviation;
        this.costByFoot = costByFoot;
        this.costByScooter = costByScooter;
    }

    public char getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(char abbreviation) {
        this.abbreviation = abbreviation;
    }

    public short getCostByFoot() {
        return costByFoot;
    }

    public void setCostByFoot(short costByFoot) {
        this.costByFoot = costByFoot;
    }

    public short getCostByScooter() {
        return costByScooter;
    }

    public void setCostByScooter(short costByScooter) {
        this.costByScooter = costByScooter;
    }
}
