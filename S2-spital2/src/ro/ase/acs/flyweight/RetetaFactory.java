package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RetetaFactory {
    private Map<String, InformatiiSanatateGenerale> informatiiSanatateGeneraleMap=new HashMap<>();

    public InformatiiSanatateGenerale getInformatiiSanatateGenerale(String recomandariSanatate) {
        InformatiiSanatateGenerale informatiiSanatateGenerale=informatiiSanatateGeneraleMap.get(recomandariSanatate);

        if(informatiiSanatateGenerale == null) {
            informatiiSanatateGenerale=new InformatiiSanatateGenerale(recomandariSanatate);
            informatiiSanatateGeneraleMap.put(recomandariSanatate, informatiiSanatateGenerale);
        }
        return informatiiSanatateGenerale;
    }
}
