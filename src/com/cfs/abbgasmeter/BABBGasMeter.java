package com.cfs.abbgasmeter;

import javax.baja.status.BStatusNumeric;
import javax.baja.sys.Action;
import javax.baja.sys.BComponent;
import javax.baja.sys.BDouble;
import javax.baja.sys.BFacets;
import javax.baja.sys.BIcon;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.units.BUnit;

import java.lang.Math;

public class BABBGasMeter
extends BComponent
{  
  /*-
  class BABBGasMeter
  {
    properties
    {
  GasDiffPress: BStatusNumeric
   -- Property to store our Outside Air Temperature
   default {[ new BStatusNumeric() ]}
   flags { summary, readonly }
   slotfacets {[ BFacets.makeNumeric( BUnit.getUnit( "inches of water" ), 1 ) ]}
   
  GasVolumeOut: BStatusNumeric
   -- Property to store our Outside Air Temperature
   default {[ new BStatusNumeric() ]}
   flags { summary, readonly }
   slotfacets {[ BFacets.makeNumeric( BUnit.getUnit( "cubic foot" ), 1 ) ]}
   
  Multiplier: double
   -- Property to store the Set Temp value
   default {[ 2 ]}
   flags { summary }
    }
    
         actions
     {
       setNewMultiplier( arg: BDouble ) : BStatusNumeric
         default {[ BDouble.make(0) ]}
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.cfs.abbgasmeter.BABBGasMeter(3343032794)1.0$ @*/
/* Generated Thu Sep 05 12:54:33 EDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
////////////////////////////////////////////////////////////////
//Property "GasVolumeOut"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>GasVolumeOut</code> property.
* Property to store our Outside Air Temperature
* @see com.cfs.abbgasmeter.BABBGasMeter#getGasVolumeOut
* @see com.cfs.abbgasmeter.BABBGasMeter#setGasVolumeOut
*/
public static final Property GasVolumeOut = newProperty(Flags.SUMMARY|Flags.READONLY, new BStatusNumeric(),BFacets.makeNumeric( BUnit.getUnit( "cubic foot" ), 1 ));

/**
* Get the <code>GasVolumeOut</code> property.
* @see com.cfs.abbgasmeter.BABBGasMeter#GasVolumeOut
*/
public BStatusNumeric getGasVolumeOut() { return (BStatusNumeric)get(GasVolumeOut); }

/**
* Set the <code>GasVolumeOut</code> property.
* @see com.cfs.abbgasmeter.BABBGasMeter#GasVolumeOut
*/
public void setGasVolumeOut(BStatusNumeric v) { set(GasVolumeOut,v,null); }

////////////////////////////////////////////////////////////////
// Property "GasDiffPress"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>GasDiffPress</code> property.
   * Property to store our Outside Air Temperature
   * @see com.cfs.abbgasmeter.BABBGasMeter#getGasDiffPress
   * @see com.cfs.abbgasmeter.BABBGasMeter#setGasDiffPress
   */
public static final Property gasDiffPress = newProperty(Flags.SUMMARY, 0,BFacets.makeNumeric( BUnit.getUnit( "inches of water" ), 2 ));

/**
 * Get the <code>setTemp</code> property.
 * @see com.cfs.test.BMyTest#setTemp
 */
public double getGasDiffPress() { return getDouble(gasDiffPress); }

/**
 * Set the <code>setTemp</code> property.
 * @see com.cfs.test.BMyTest#setTemp
 */
public void setGasDiffPress(double v) { setDouble(gasDiffPress,v,null); }

////////////////////////////////////////////////////////////////
// Property "Multiplier"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Multiplier</code> property.
   * Property to store the Set Temp value
   * @see com.cfs.abbgasmeter.BABBGasMeter#getMultiplier
   * @see com.cfs.abbgasmeter.BABBGasMeter#setMultiplier
   */
  public static final Property Multiplier = newProperty(Flags.SUMMARY|Flags.HIDDEN, 2,null);
  
  /**
   * Get the <code>Multiplier</code> property.
   * @see com.cfs.abbgasmeter.BABBGasMeter#Multiplier
   */
  public double getMultiplier() { return getDouble(Multiplier); }
  
  /**
   * Set the <code>Multiplier</code> property.
   * @see com.cfs.abbgasmeter.BABBGasMeter#Multiplier
   */
  public void setMultiplier(double v) { setDouble(Multiplier,v,null); }

////////////////////////////////////////////////////////////////
// Action "setNewMultiplier"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>setNewMultiplier</code> action.
   * @see com.cfs.abbgasmeter.BABBGasMeter#setNewMultiplier()
   */
  public static final Action setNewMultiplier = newAction(0,BDouble.make(0),null);
  
  /**
   * Invoke the <code>setNewMultiplier</code> action.
   * @see com.cfs.abbgasmeter.BABBGasMeter#setNewMultiplier
   */
  public BStatusNumeric setNewMultiplier(BDouble arg) { return (BStatusNumeric)invoke(setNewMultiplier,arg,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BABBGasMeter.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  
  public BStatusNumeric doSetNewMultiplier(BDouble arg)
  {    
    setMultiplier(arg.getDouble());
    return new BStatusNumeric(arg.getDouble());
  }
  
  public void calcVolume()
  {    
    double dp = getGasDiffPress();
    double mult = getMultiplier();
    BStatusNumeric out = getGasVolumeOut();
    
    out = (new BStatusNumeric(Math.pow(dp, mult)));
    
    setGasVolumeOut(out);
  }

  public void changed(Property prop, Context context)
  {
    if (prop.equals(gasDiffPress) || prop.equals(Multiplier))
      {
        calcVolume();
      }
  }

  public BIcon getIcon() { return icon; }
  private static final BIcon icon = BIcon.make("module://kitEfficiency/res/abbgas.png"); 
  
}
