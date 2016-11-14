package com.cfs.alarmanalyzer;

import javax.baja.collection.*;
import javax.baja.naming.BOrd;
import javax.baja.status.BStatus;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusString;
import javax.baja.sys.BComponent;
import javax.baja.sys.BIcon;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

public class BAlarmAnalyzer
extends BComponent
{
  /*-
  class BAlarmAnalyzer
  {
    properties
    {
       BaseSystemFolder: BOrd
       default {[ BOrd.make("local:|fox:|station:|slot:/") ]}
       LastAlarm: BStatusString
       default {[ new BStatusString() ]}
       TotalAlarms: BStatusNumeric
       default {[ new BStatusNumeric() ]}
       flags { summary, readonly }
    }
    
         actions
     {
        performAction()
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.cfs.alarmanalyzer.BAlarmAnalyzer(2127947959)1.0$ @*/
/* Generated Tue Sep 10 10:42:46 EDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "BaseSystemFolder"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>BaseSystemFolder</code> property.
   * ORD for the history that we will iterate through
   * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
   * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
   */
  public static final Property BaseSystemFolder = newProperty(Flags.SUMMARY, BOrd.make("local:|fox:|station:|slot:/"),null);
  
  /**
   * Get the <code>BaseSystemFolder</code> property.
   * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
   */
  public BOrd getBaseSystemFolder() { return (BOrd)get(BaseSystemFolder); }
  
  /**
   * Set the <code>BaseSystemFolder</code> property.
   * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
   */
  public void setBaseSystemFolder(BOrd v) { set(BaseSystemFolder,v,null); }
  
////////////////////////////////////////////////////////////////
//Property "AlarmClass"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#getLastAlarm
* @see com.cfs.test.BMyTest#setLastAlarm
*/
public static final Property AlarmClass = newProperty(Flags.SUMMARY, new BStatusString(),null);

/**
* Get the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#LastAlarm
*/
public BStatusString getAlarmClass() { return (BStatusString)get(AlarmClass); }

/**
* Set the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#LastAlarm
*/
public void setAlarmClass(BStatusString v) { set(AlarmClass,v,null); }
  
////////////////////////////////////////////////////////////////
//Property "LastAlarm"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#getLastAlarm
* @see com.cfs.test.BMyTest#setLastAlarm
*/
public static final Property LastAlarm = newProperty(Flags.SUMMARY|Flags.READONLY, new BStatusString(),null);

/**
* Get the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#LastAlarm
*/
public BStatusString getLastAlarm() { return (BStatusString)get(LastAlarm); }

/**
* Set the <code>LastAlarm</code> property.
* @see com.cfs.test.BMyTest#LastAlarm
*/
public void setLastAlarm(BStatusString v) { set(LastAlarm,v,null); }

////////////////////////////////////////////////////////////////
//Property "TotalAlarms"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#getTotalAlarms
* @see com.cfs.test.BMyTest#setTotalAlarms
*/
public static final Property TotalAlarms = newProperty(Flags.SUMMARY|Flags.READONLY, new BStatusNumeric(),null);

/**
* Get the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#TotalAlarms
*/
public BStatusNumeric getTotalAlarms() { return (BStatusNumeric)get(TotalAlarms); }

/**
* Set the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#TotalAlarms
*/
public void setTotalAlarms(BStatusNumeric v) { set(TotalAlarms,v,null); }

public static final Property ActiveSystemAlarm = newProperty(Flags.SUMMARY, new BStatusBoolean(),null);
  
  /**
   * Get the <code>in</code> property.
   * @see com.cfs.test.BMyTest#in
   */
  public BStatusBoolean getActiveSystemAlarm() { return (BStatusBoolean)get(ActiveSystemAlarm); }
  
  /**
   * Set the <code>in</code> property.
   * @see com.cfs.test.BMyTest#in
   */
  public void setActiveSystemAlarm(BStatusBoolean v) { set(ActiveSystemAlarm,v,null); }

////////////////////////////////////////////////////////////////
//Property "UpdateTrigger"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#getTotalAlarms
* @see com.cfs.test.BMyTest#setTotalAlarms
*/
public static final Property UpdateTrigger = newProperty(Flags.SUMMARY, new BStatusString(),null);

/**
* Get the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#TotalAlarms
*/
public BStatusString getUpdateTrigger() { return (BStatusString)get(UpdateTrigger); }

/**
* Set the <code>TotalAlarms</code> property.
* @see com.cfs.test.BMyTest#TotalAlarms
*/
public void setUpdateTrigger(BStatusString v) { set(UpdateTrigger,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAlarmAnalyzer.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public void changed(Property prop, Context context)
  {
    if (prop.equals(UpdateTrigger))
    {
      updateAlarms();
    }
  }
  
  public void updateAlarms()
  {
    //String[] currentAlarms = new String[50];
    BOrd ord = getBaseSystemFolder();
    String aClass = getAlarmClass().toString();
    aClass = aClass.substring(0, aClass.indexOf(" "));
   
    ord = BOrd.make(ord + "|bql:select * from alarm:AlarmSourceExt where alarmClass = '" + aClass + "' and status.alarm = true");
    String lastAlm = getLastAlarm().toString();
    
    BITable result = (BITable)ord.resolve().get(); 
    
    ColumnList columns = result.getColumns(); 
    Column valueColumn = columns.get(0); 
    TableCursor c = (TableCursor)result.cursor(); 
    
    int count = 0; 
    
    while (c.next()) 
    { 
      count = count + 1; 
      
      if (lastAlm != c.get(valueColumn).toString())
      {
        lastAlm = c.get(valueColumn).toString();
      }
    } 
    
    setLastAlarm(new BStatusString(lastAlm));
    
    if (count > 0)
    {
      setActiveSystemAlarm(new BStatusBoolean(true));
      getActiveSystemAlarm().setStatus(BStatus.alarm);
    }
 
    else
    {
      setActiveSystemAlarm(new BStatusBoolean(false));
      getActiveSystemAlarm().setStatus(BStatus.ok);
    }
    
    setTotalAlarms(new BStatusNumeric(count));
  }
  
  public BIcon getIcon() { return icon; }
  private static final BIcon icon = BIcon.make("module://kitEfficiency/res/alarm.png"); 
  
}  
