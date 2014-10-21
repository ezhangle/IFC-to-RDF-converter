package org.buildingsmart.IFC4_ADD1;
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

public class IfcMaterialLayerSet extends IfcMaterialDefinition 
{
	// The property attributes
	private List<IfcMaterialLayer> MaterialLayers = new ArrayList<IfcMaterialLayer>();
	private IfcLabel LayerSetName;
	private IfcText Description_of_IfcMaterialLayerSet;


	// Getters and setters of properties
	public List<IfcMaterialLayer> getMaterialLayers() {
		return MaterialLayers;
	}

	public void setMaterialLayers(IfcMaterialLayer value){
		this.MaterialLayers.add(value);
	}

	public IfcLabel getLayerSetName() {
		return LayerSetName;
	}

	public void setLayerSetName(IfcLabel value){
		this.LayerSetName=value;
	}

	public IfcText getDescription_of_IfcMaterialLayerSet() {
		return Description_of_IfcMaterialLayerSet;
	}

	public void setDescription_of_IfcMaterialLayerSet(IfcText value){
		this.Description_of_IfcMaterialLayerSet=value;
	}

}