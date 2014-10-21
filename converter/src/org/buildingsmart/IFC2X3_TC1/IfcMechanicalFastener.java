package org.buildingsmart.IFC2X3_TC1;
import org.buildingsmart.*;
import java.util.*;

/*
 * IFC Java class
/ *
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari (original)
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IfcMechanicalFastener extends IfcFastener 
{
	// The property attributes
	private IfcPositiveLengthMeasure NominalDiameter_of_IfcMechanicalFastener;
	private IfcPositiveLengthMeasure NominalLength;


	// Getters and setters of properties
	public IfcPositiveLengthMeasure getNominalDiameter_of_IfcMechanicalFastener() {
		return NominalDiameter_of_IfcMechanicalFastener;
	}

	public void setNominalDiameter_of_IfcMechanicalFastener(IfcPositiveLengthMeasure value){
		this.NominalDiameter_of_IfcMechanicalFastener=value;
	}

	public IfcPositiveLengthMeasure getNominalLength() {
		return NominalLength;
	}

	public void setNominalLength(IfcPositiveLengthMeasure value){
		this.NominalLength=value;
	}

}