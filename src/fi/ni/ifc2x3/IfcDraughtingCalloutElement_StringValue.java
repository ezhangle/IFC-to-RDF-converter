package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;

/*
 * IFC Java class for String valued unknown interface type
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/ 
 */

public class IfcDraughtingCalloutElement_StringValue implements IfcDraughtingCalloutElement
{
String value;
public String geValue() {
return value;
}
public void setValue(String value){
this.value=value;
}
}
