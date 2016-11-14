package com.cfs.ahuanalyzer;

import javax.baja.collection.BITable;
import javax.baja.collection.Column;
import javax.baja.collection.ColumnList;
import javax.baja.collection.TableCursor;
import javax.baja.naming.BOrd;
import javax.baja.status.BStatusNumeric;
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

//import org.joda.time.DateTime;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class BAhuAnalyzer
extends BComponent
{
  /*-
  class BMyTest
  {
    properties
    {
  OAT: BStatusNumeric
   -- Property to store our Outside Air Temperature
   default {[ new BStatusNumeric() ]}
   flags { summary, readonly }
   slotfacets {[ BFacets.makeNumeric( BUnit.getUnit( "fahrenheit" ), 1 ) ]}
   
  setTemp: double
   -- Property to store the Set Temp value
   default {[ 0 ]}
   flags { summary }
   slotfacets {[ BFacets.makeNumeric( BUnit.getUnit( "fahrenheit" ), 1 ) ]}
    }
    
         actions
     {
       convertTemp( arg: BDouble ) : BStatusNumeric
         default {[ BDouble.make(0) ]}
                  
       performAction()
     }
     
     topics
     {
       actionPerformed: BComponent
         flags { summary }
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.cfs.test.BMyTest(1377649730)1.0$ @*/
/* Generated Thu Aug 22 11:29:40 EDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "OAT"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>OAT</code> property.
   * Property to store our Outside Air Temperature
   * @see com.cfs.test.BMyTest#getOAT
   * @see com.cfs.test.BMyTest#setOAT
   */
  public static final Property OutsideTemp = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric( BUnit.getUnit( "fahrenheit" ), 1 ));
  
  /**
   * Get the <code>OAT</code> property.
   * @see com.cfs.test.BMyTest#OAT
   */
  public BStatusNumeric getOutsideTemp() { return (BStatusNumeric)get(OutsideTemp); }
  
  /**
   * Set the <code>OAT</code> property.
   * @see com.cfs.test.BMyTest#OAT
   */
  public void setOutsideTemp(BStatusNumeric v) { set(OutsideTemp,v,null); }
  
////////////////////////////////////////////////////////////////
//Property "OAH"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>OAT</code> property.
* Property to store our Outside Air Temperature
* @see com.cfs.test.BMyTest#getOAT
* @see com.cfs.test.BMyTest#setOAT
*/
public static final Property OutsideHumidity = newProperty(Flags.SUMMARY, new BStatusNumeric(),BFacets.makeNumeric( BUnit.getUnit( "percent" ), 1 ));

/**
* Get the <code>OAT</code> property.
* @see com.cfs.test.BMyTest#OAT
*/
public BStatusNumeric getOutsideHumidity() { return (BStatusNumeric)get(OutsideHumidity); }

/**
* Set the <code>OAT</code> property.
* @see com.cfs.test.BMyTest#OAT
*/
public void setOutsideHumidity(BStatusNumeric v) { set(OutsideHumidity,v,null); }

////////////////////////////////////////////////////////////////
// Property "setTemp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>setTemp</code> property.
   * Property to store the Set Temp value
   * @see com.cfs.test.BMyTest#getSetTemp
   * @see com.cfs.test.BMyTest#setSetTemp
   */
  public static final Property setTemp = newProperty(Flags.SUMMARY, 10,BFacets.makeNumeric( BUnit.getUnit( "fahrenheit" ), 1 ));
  
  /**
   * Get the <code>setTemp</code> property.
   * @see com.cfs.test.BMyTest#setTemp
   */
  public double getSetTemp() { return getDouble(setTemp); }
  
  /**
   * Set the <code>setTemp</code> property.
   * @see com.cfs.test.BMyTest#setTemp
   */
  public void setSetTemp(double v) { setDouble(setTemp,v,null); }
  
  public BOrd getStartOrd() {return (BOrd)get("startOrd");}
  public void setStartOrd(javax.baja.naming.BOrd v) {set("startOrd",v);}

////////////////////////////////////////////////////////////////
// Action "convertTemp"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>convertTemp</code> action.
   * @see com.cfs.test.BMyTest#convertTemp()
   */
  public static final Action convertTemp = newAction(0,BDouble.make(0),null);
  
  /**
   * Invoke the <code>convertTemp</code> action.
   * @see com.cfs.test.BMyTest#convertTemp
   */
  public BStatusNumeric convertTemp(BDouble arg) { return (BStatusNumeric)invoke(convertTemp,arg,null); }
  
////////////////////////////////////////////////////////////////
//Action "convertTemp"
////////////////////////////////////////////////////////////////
  
  public static final Action userValue = newAction(0,BDouble.make(0),null);
  
  /**
   * Invoke the <code>convertTemp</code> action.
   * @see com.cfs.test.BMyTest#convertTemp
   */
  public BStatusNumeric userValue(BDouble arg) { return (BStatusNumeric)invoke(userValue,arg,null); }

////////////////////////////////////////////////////////////////
// Action "performAction"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>performAction</code> action.
   * @see com.cfs.test.BMyTest#performAction()
   */
  public static final Action performAction = newAction(0,null);
  
  /**
   * Invoke the <code>performAction</code> action.
   * @see com.cfs.test.BMyTest#performAction
   */
  public void performAction() { invoke(performAction,null,null); }
  
////////////////////////////////////////////////////////////////
//Action "makePoint"
////////////////////////////////////////////////////////////////

/**
* Slot for the <code>performAction</code> action.
* @see com.cfs.test.BMyTest#performAction()
*/
public static final Action makePoint = newAction(0,null);

/**
* Invoke the <code>performAction</code> action.
* @see com.cfs.test.BMyTest#performAction
*/
public void makePoint() { invoke(makePoint,null,null); }

////////////////////////////////////////////////////////////////
// Topic "actionPerformed"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>actionPerformed</code> topic.
   * @see com.cfs.test.BMyTest#fireActionPerformed
   */
  public static final Topic actionPerformed = newTopic(Flags.SUMMARY|Flags.HIDDEN,null);
  
  /**
   * Fire an event for the <code>actionPerformed</code> topic.
   * @see com.cfs.test.BMyTest#actionPerformed
   */
  public void fireActionPerformed(BComponent event) { fire(actionPerformed, event, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BAhuAnalyzer.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  /**
   * This callback is required for our convertTemp Action. If this 
   * callback is not included, the station Registry will prevent the 
   * component from being added to a station.
   * 
   * @param arg
   *          - {@link BDouble} argument value for this action.
   *          
   * @return {@link BStatusNumeric} value.
   */
  public BStatusNumeric doUserValue(BDouble arg)
  {
    setOutsideTemp(new BStatusNumeric(arg.getDouble()));
    return new BStatusNumeric(arg.getDouble());
  }
  
  public BStatusNumeric doConvertTemp(BDouble arg)
  {
    //BNotification notify = new BNotification();
    //notify.raise(!(Thread.currentThread() instanceof ContextThread));
    
    setOutsideHumidity(new BStatusNumeric(arg.getDouble()));
    return new BStatusNumeric(arg.getDouble());
  }
  
  /**
   * This callback is required for our performAction Action.If this 
   * callback is not included, the station Registry will prevent the 
   * component from being added to a station.
   */
  public void doPerformAction()
  {
    //This action may perform some task that doesn't require
    //a value to be returned.
    double high;
    
    high = getSetTemp();
    
    setOutsideTemp(new BStatusNumeric(high));
    setOutsideHumidity(new BStatusNumeric(high - 5));
  }
  
  public void doMakePoint()
  {
    //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    //Date date = new Date();
    //+ dateFormat.format(date)
    
    generateCsvFile("C:\\Users\\bryan\\GasMeterExports.csv"); 
  }
  
  private static void generateCsvFile(String sFileName)
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
      
      BOrd ord1 = BOrd.make("ip:10.107.80.57|fox:|history:/B1Jace1/ConsumptionToday$2fGasConsumption_B1|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord2 = BOrd.make("ip:10.107.80.57|fox:|history:/B1Jace1/ConsumptionToday$2fGasConsumption_B2|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord3 = BOrd.make("ip:10.107.80.57|fox:|history:/B1Jace1/ConsumptionToday$2fGasConsumption_B3|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord4 = BOrd.make("ip:10.107.80.57|fox:|history:/B2Jace4/Wiresheet_Programming$2fB2CafeteriaToday|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord5 = BOrd.make("ip:10.107.80.57|fox:|history:/B4AJace1/ConsumptionToday$2fGasConsumption|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord6 = BOrd.make("ip:10.107.80.57|fox:|history:/B5Jace1/ConsumptionToday$2fGasConsumption_RTO|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord7 = BOrd.make("ip:10.107.80.57|fox:|history:/B7Jace1/ConsumptionToday$2fGasConsumption_BLR_HTD1|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord8 = BOrd.make("ip:10.107.80.57|fox:|history:/B7Jace1/ConsumptionToday$2fGasConsumption_BLR_HCC1|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord9 = BOrd.make("ip:10.107.80.57|fox:|history:/B7Jace1/ConsumptionToday$2fGasConsumption_BLR_HTD2|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord10 = BOrd.make("ip:10.107.80.57|fox:|history:/B7Jace1/ConsumptionToday$2fGasConsumption_MUA|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord11 = BOrd.make("ip:10.107.80.57|fox:|history:/B8Jace1/ConsumptionToday$2fGasConsumption_B8MC1|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord12 = BOrd.make("ip:10.107.80.57|fox:|history:/B13Jace1/ConsumptionToday$2fGasConsumption_RTO|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord13 = BOrd.make("ip:10.107.80.57|fox:|history:/B14Jace1/ConsumptionToday$2fGasConsumption_RTO|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      BOrd ord14 = BOrd.make("ip:10.107.80.57|fox:|history:/B14Jace1/ConsumptionToday$2fGasConsumption_BLR|bql:select timestamp as 'TimeStamp',value as 'Value' where timestamp in bqlTime.lastmonth");
      
      FileWriter writer = new FileWriter(sFileName);
      int i = 1; 
      int total = 0;
      String startDate = "";
      String newDate = "";
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
      
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
      
      startDate = reportDate[1];
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
      
      BITable result12 = (BITable)ord12.resolve().get();
      TableCursor c12 = (TableCursor)result12.cursor(); 
      ColumnList columns12 = result12.getColumns();
      Column dateColumn12 = columns12.get(0); 
      Column valueColumn12 = columns12.get(1); 
      
      i = 1;
      while (c12.next())
      {
        //newDate = (c12.get(dateColumn12).toString());
        break;
      }
     // DateTime date12 = new DateTime(newDate);
      //int diff12 = Days.daysBetween(date12, date).getDays();
      
      //for (int d = 0; d < diff12; d++) 
      //{
      //  value12[i] = "0";
      //}
      
      while (c12.next()) 
      { 
        
        value12[i] = (c12.get(valueColumn12).toString());
        i = i + 1;
      }
      
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
  private static final BIcon icon = BIcon.make("module://kitEfficiency/res/line.gif"); 
  
}  
