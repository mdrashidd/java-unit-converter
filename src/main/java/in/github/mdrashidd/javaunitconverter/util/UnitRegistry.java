package in.github.mdrashidd.javaunitconverter.util;
import in.github.mdrashidd.javaunitconverter.model.*;

import  java.util.*;
import java.util.stream.Collectors;

public final class UnitRegistry {
	
	private static final Map<UnitType , List<Unit>> UNIT_BY_TYPE;
	
	static {
		Map<UnitType, List<Unit>> modifyableMap= new EnumMap<>(UnitType.class);
		
		modifyableMap.put(UnitType.LENGTH, List.of(LengthUnit.values()));
		 UNIT_BY_TYPE = Collections.unmodifiableMap(modifyableMap);
	}
	
	private UnitRegistry() {}  //private constructor
	
	public static List<Unit> getUnitByType(Unit type){
		return UNIT_BY_TYPE.getOrDefault(type, Collections.emptyList());
	}
	
	public static Set<UnitType> getAvailableType(){
		return UNIT_BY_TYPE.keySet();
	}
	

}
