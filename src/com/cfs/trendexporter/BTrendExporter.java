package com.cfs.trendexporter;

import javax.baja.collection.BITable;
import javax.baja.collection.Column;
import javax.baja.collection.ColumnList;
import javax.baja.collection.TableCursor;
import javax.baja.naming.BOrd;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusString;
import javax.baja.sys.Action;
import javax.baja.sys.BComponent;
import javax.baja.sys.BDouble;
import javax.baja.sys.BFacets;
import javax.baja.sys.BIcon;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Topic;
import javax.baja.sys.Type;
import javax.baja.units.BUnit;

import java.io.FileWriter;
import java.io.IOException;
//import java.text.SimpleDateFormat;

public class BTrendExporter
extends BComponent
{
  
  /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
  /*@ $com.cfs.alarmanalyzer.BAlarmAnalyzer(2127947959)1.0$ @*/
  /* Generated Tue Sep 10 10:42:46 EDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

  ////////////////////////////////////////////////////////////////
  //Property "SupAddress"
  ////////////////////////////////////////////////////////////////

  /**
  * Slot for the <code>LastAlarm</code> property.
  * @see com.cfs.test.BMyTest#getLastAlarm
  * @see com.cfs.test.BMyTest#setLastAlarm
  */
  public static final Property SupAddress = newProperty(Flags.SUMMARY, new BStatusString());

  /**
  * Get the <code>LastAlarm</code> property.
  * @see com.cfs.test.BMyTest#LastAlarm
  */
  public BStatusString getSupAddress() { return (BStatusString)get(SupAddress); }

  /**
  * Set the <code>LastAlarm</code> property.
  * @see com.cfs.test.BMyTest#LastAlarm
  */
  public void setSupAddress(BStatusString v) { set(SupAddress,v,null); }
  
  ////////////////////////////////////////////////////////////////
  // Property "HistoryOne"
  ////////////////////////////////////////////////////////////////
    
    /**
     * Slot for the <code>BaseSystemFolder</code> property.
     * ORD for the history that we will iterate through
     * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
     * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
     */
    public static final Property HistoryOne = newProperty(Flags.SUMMARY, BOrd.make("null"),null);
    
    /**
     * Get the <code>BaseSystemFolder</code> property.
     * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
     */
    public BOrd getHistoryOne() { return (BOrd)get(HistoryOne); }
    
    /**
     * Set the <code>BaseSystemFolder</code> property.
     * @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
     */
    public void setHistoryOne(BOrd v) { set(HistoryOne,v,null); }
    
////////////////////////////////////////////////////////////////
// Property "HistoryTwo"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryTwo = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryTwo() { return (BOrd)get(HistoryTwo); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryTwo(BOrd v) { set(HistoryTwo,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryThree"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryThree = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryThree() { return (BOrd)get(HistoryThree); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryThree(BOrd v) { set(HistoryThree,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryFour"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryFour = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryFour() { return (BOrd)get(HistoryFour); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryFour(BOrd v) { set(HistoryFour,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryFive"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryFive = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryFive() { return (BOrd)get(HistoryFive); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryFive(BOrd v) { set(HistoryFive,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistorySix"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistorySix = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistorySix() { return (BOrd)get(HistorySix); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistorySix(BOrd v) { set(HistorySix,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistorySeven"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistorySeven = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistorySeven() { return (BOrd)get(HistorySeven); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistorySeven(BOrd v) { set(HistorySeven,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryEight"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryEight = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryEight() { return (BOrd)get(HistoryEight); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryEight(BOrd v) { set(HistoryEight,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryNine"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryNine = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryNine() { return (BOrd)get(HistoryNine); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryNine(BOrd v) { set(HistoryNine,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryTen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryTen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryTen() { return (BOrd)get(HistoryTen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryTen(BOrd v) { set(HistoryTen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryEleven"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryEleven = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryEleven() { return (BOrd)get(HistoryEleven); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryEleven(BOrd v) { set(HistoryEleven,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryTwelve"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryTwelve = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryTwelve() { return (BOrd)get(HistoryTwelve); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryTwelve(BOrd v) { set(HistoryTwelve,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryThirteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryThirteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryThirteen() { return (BOrd)get(HistoryThirteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryThirteen(BOrd v) { set(HistoryThirteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryFourteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryFourteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryFourteen() { return (BOrd)get(HistoryFourteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryFourteen(BOrd v) { set(HistoryFourteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryFifteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryFifteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryFifteen() { return (BOrd)get(HistoryFifteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryFifteen(BOrd v) { set(HistoryFifteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistorySixteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistorySixteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistorySixteen() { return (BOrd)get(HistorySixteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistorySixteen(BOrd v) { set(HistorySixteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistorySeventeen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistorySeventeen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistorySeventeen() { return (BOrd)get(HistorySeventeen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistorySeventeen(BOrd v) { set(HistorySeventeen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryEighteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryEighteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryEighteen() { return (BOrd)get(HistoryEighteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryEighteen(BOrd v) { set(HistoryEighteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryNineteen"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryNineteen = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryNineteen() { return (BOrd)get(HistoryNineteen); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryNineteen(BOrd v) { set(HistoryNineteen,v,null); }

////////////////////////////////////////////////////////////////
//Property "HistoryTwenty"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>BaseSystemFolder</code> property.
* ORD for the history that we will iterate through
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#getBaseSystemFolder
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#setBaseSystemFolder
*/
public static final Property HistoryTwenty = newProperty(Flags.SUMMARY, BOrd.make("null"),null);

/**
* Get the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public BOrd getHistoryTwenty() { return (BOrd)get(HistoryTwenty); }

/**
* Set the <code>BaseSystemFolder</code> property.
* @see com.cfs.alarmanalyzer.BAlarmAnalyzer#BaseSystemFolder
*/
public void setHistoryTwenty(BOrd v) { set(HistoryTwenty,v,null); }

////////////////////////////////////////////////////////////////
//Action "runReport"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>performAction</code> action.
* @see com.cfs.test.BMyTest#performAction()
*/
public static final Action runReport = newAction(0,null);

/**
* Invoke the <code>performAction</code> action.
* @see com.cfs.test.BMyTest#performAction
*/
public void runReport() { invoke(runReport,null,null); }

  ////////////////////////////////////////////////////////////////
  // Type
  ////////////////////////////////////////////////////////////////
    
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BTrendExporter.class);

  /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  public void doRunReport()
  { 
    generateCsvFile("C:\\Users\\bryan\\GasMeterExports.csv"); 
  }
  
  public void generateCsvFile(String sFileName)
  {
    try
    {
      String[] reportDate = new String[35];
      String[] value1 = new String[35];
      String[] value2 = new String[35];
      String[] value3 = new String[35];
      String[] value4 = new String[35];
      String[] value5 = new String[35];
      String[] value6 = new String[35];
      String[] value7 = new String[35];
      String[] value8 = new String[35];
      String[] value9 = new String[35];
      String[] value10 = new String[35];
      String[] value11 = new String[35];
      String[] value12 = new String[35];
      String[] value13 = new String[35];
      String[] value14 = new String[35];
      String[] value15 = new String[35];
      String[] value16 = new String[35];
      String[] value17 = new String[35];
      String[] value18 = new String[35];
      String[] value19 = new String[35];
      String[] value20 = new String[35];
      
      BOrd ord1 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryOne().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord2 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryTwo().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord3 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryThree().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord4 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryFour().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord5 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryFive().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord6 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistorySix().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord7 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistorySeven().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord8 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryEight().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord9 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryNine().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord10 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryTen().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord11 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryOne().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord12 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryOne().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord13 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryOne().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord14 = BOrd.make("ip:" + getSupAddress().toString() + "|fox:|" + getHistoryOne().toString() + "|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      
      FileWriter writer = new FileWriter(sFileName);
      int i = 1; 
      int total = 0;
      String startDate = "";
      String newDate = "";
      //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
      
      BITable result = (BITable)ord1.resolve().get(); 
      ColumnList columns = result.getColumns();
      Column dateColumn = columns.get(0); 
      Column valueColumn = columns.get(1); 
      
      TableCursor c = (TableCursor)result.cursor(); 
      while (c.next()) 
      {
        reportDate[i] = (c.get(dateColumn).toString());
        value1[i] = (c.get(valueColumn).toString());
        i = i + 1;
      }
      
      //startDate = reportDate[1];
      //DateTime date = new DateTime(startDate);
      total = i;
      
      BITable result2 = (BITable)ord2.resolve().get();
      TableCursor c2 = (TableCursor)result2.cursor(); 
      ColumnList columns2 = result2.getColumns();
      Column valueColumn2 = columns2.get(1); 
      
      i = 1;
      while (c2.next()) 
      { 
        value2[i] = (c2.get(valueColumn2).toString());
        i = i + 1;
      }
      
      BITable result3 = (BITable)ord3.resolve().get();
      TableCursor c3 = (TableCursor)result3.cursor(); 
      ColumnList columns3 = result3.getColumns();
      Column valueColumn3 = columns3.get(1); 
      
      i = 1;
      while (c3.next()) 
      { 
        value3[i] = (c3.get(valueColumn3).toString());
        i = i + 1;
      }
      
      BITable result4 = (BITable)ord4.resolve().get();
      TableCursor c4 = (TableCursor)result4.cursor(); 
      ColumnList columns4 = result4.getColumns();
      Column valueColumn4 = columns4.get(1); 
      
      i = 1;
      while (c4.next()) 
      { 
        value4[i] = (c4.get(valueColumn4).toString());
        i = i + 1;
      }
      
      BITable result5 = (BITable)ord5.resolve().get();
      TableCursor c5 = (TableCursor)result5.cursor(); 
      ColumnList columns5 = result5.getColumns();
      Column valueColumn5 = columns5.get(1); 
      
      i = 1;
      while (c5.next()) 
      { 
        value5[i] = (c5.get(valueColumn5).toString());
        i = i + 1;
      }
      
      BITable result6 = (BITable)ord6.resolve().get();
      TableCursor c6 = (TableCursor)result6.cursor(); 
      ColumnList columns6 = result6.getColumns();
      Column valueColumn6 = columns6.get(1); 
      
      i = 1;
      while (c6.next()) 
      { 
        value6[i] = (c6.get(valueColumn6).toString());
        i = i + 1;
      }
      
      BITable result7 = (BITable)ord7.resolve().get();
      TableCursor c7 = (TableCursor)result7.cursor(); 
      ColumnList columns7 = result7.getColumns();
      Column valueColumn7 = columns7.get(1); 
      
      i = 1;
      while (c7.next()) 
      { 
        value7[i] = (c7.get(valueColumn7).toString());
        i = i + 1;
      }
      
      BITable result8 = (BITable)ord8.resolve().get();
      TableCursor c8 = (TableCursor)result8.cursor(); 
      ColumnList columns8 = result8.getColumns();
      Column valueColumn8 = columns8.get(1); 
      
      i = 1;
      while (c8.next()) 
      { 
        value8[i] = (c8.get(valueColumn8).toString());
        i = i + 1;
      }
      
      BITable result9 = (BITable)ord9.resolve().get();
      TableCursor c9 = (TableCursor)result9.cursor(); 
      ColumnList columns9 = result9.getColumns();
      Column valueColumn9 = columns9.get(1); 
      
      i = 1;
      while (c9.next()) 
      { 
        value9[i] = (c9.get(valueColumn9).toString());
        i = i + 1;
      }
      
      BITable result10 = (BITable)ord10.resolve().get();
      TableCursor c10 = (TableCursor)result10.cursor(); 
      ColumnList columns10 = result10.getColumns();
      Column valueColumn10 = columns10.get(1); 
      
      i = 1;
      while (c10.next()) 
      { 
        value10[i] = (c10.get(valueColumn10).toString());
        i = i + 1;
      }
      
      BITable result11 = (BITable)ord11.resolve().get();
      TableCursor c11 = (TableCursor)result11.cursor(); 
      ColumnList columns11 = result11.getColumns();
      Column valueColumn11 = columns11.get(1); 
      
      i = 1;
      while (c11.next()) 
      { 
        value11[i] = (c11.get(valueColumn11).toString());
        i = i + 1;
      }
      
      //BITable result12 = (BITable)ord12.resolve().get();
      //TableCursor c12 = (TableCursor)result12.cursor(); 
      //ColumnList columns12 = result12.getColumns();
      //Column dateColumn12 = columns12.get(0); 
     // Column valueColumn12 = columns12.get(1); 
      
     // i = 1;
     // while (c12.next())
      //{
        //newDate = (c12.get(dateColumn12).toString());
      //  break;
     // }
     // DateTime date12 = new DateTime(newDate);
      //int diff12 = Days.daysBetween(date12, date).getDays();
      
      //for (int d = 0; d < diff12; d++) 
      //{
      //  value12[i] = "0";
      //}
      
      //while (c12.next()) 
      //{ 
        
       // value12[i] = (c12.get(valueColumn12).toString());
       // i = i + 1;
     // }
      
      BITable result13 = (BITable)ord13.resolve().get();
      TableCursor c13 = (TableCursor)result13.cursor(); 
      ColumnList columns13 = result13.getColumns();
      Column valueColumn13 = columns13.get(1); 
      
      i = 1;
      while (c13.next()) 
      { 
        value13[i] = (c13.get(valueColumn13).toString());
        i = i + 1;
      }
      
      BITable result14 = (BITable)ord14.resolve().get();
      TableCursor c14 = (TableCursor)result14.cursor(); 
      ColumnList columns14 = result14.getColumns();
      Column valueColumn14 = columns14.get(1); 
      
      i = 1;
      while (c14.next()) 
      { 
        value14[i] = (c14.get(valueColumn14).toString());
        i = i + 1;
      }
      
      writer.write("Date/Time");
      writer.write(',');
      writer.write("B1 Boiler 1");
      writer.write(',');
      writer.write("B1 Boiler 2");
      writer.write(',');
      writer.write("B1 Boiler 3");
      writer.write(',');
      writer.write("B2 Cafeteria");
      writer.write(',');
      writer.write("B4A Ovens");
      writer.write(',');
      writer.write("B5 RTO");
      writer.write(',');
      writer.write("B7 HTD1 Boiler");
      writer.write(',');
      writer.write("B7 HCC1 Boiler");
      writer.write(',');
      writer.write("B7 HTD2 Boiler");
      writer.write(',');
      writer.write("B7 Make-up Air");
      writer.write(',');
      writer.write("B8 Boiler1");
      writer.write(',');
      writer.write("B13 RTO");
      writer.write(',');
      writer.write("B14 RTO");
      writer.write(',');
      writer.write("B14 Boiler");
      writer.write('\n');
      
      for (int v = 1; v < total; v++)  
      { 
          writer.write(reportDate[v]);
          writer.write(',');
          writer.write(value1[v]);
          writer.write(',');
          writer.write(value2[v]);
          writer.write(',');
          writer.write(value3[v]);
          writer.write(',');
          writer.write(value4[v]);
          writer.write(',');
          writer.write(value5[v]);
          writer.write(',');
          writer.write(value6[v]);
          writer.write(',');
          writer.write(value7[v]);
          writer.write(',');
          writer.write(value8[v]);
          writer.write(',');
          writer.write(value9[v]);
          writer.write(',');
          writer.write(value10[v]);
          writer.write(',');
          writer.write(value11[v]);
          writer.write(',');
         // writer.write(diff12);
          writer.write(',');
          writer.write(value13[v]);
          writer.write(',');
          writer.write(value14[v]);
          writer.write('\n');
      } 

      writer.flush();
      writer.close();
    }
    
    catch(IOException e)
    {
      e.printStackTrace();
    } 
  }
  
  public BIcon getIcon() { return icon; }
  private static final BIcon icon = BIcon.make("module://kitEfficiency/res/line.png"); 
  
}  
