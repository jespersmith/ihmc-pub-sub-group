/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public final class DestinationOrderQosPolicyKind {
  public final static DestinationOrderQosPolicyKind BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS = new DestinationOrderQosPolicyKind("BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS");
  public final static DestinationOrderQosPolicyKind BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS = new DestinationOrderQosPolicyKind("BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static DestinationOrderQosPolicyKind swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + DestinationOrderQosPolicyKind.class + " with value " + swigValue);
  }

  private DestinationOrderQosPolicyKind(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private DestinationOrderQosPolicyKind(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private DestinationOrderQosPolicyKind(String swigName, DestinationOrderQosPolicyKind swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static DestinationOrderQosPolicyKind[] swigValues = { BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS, BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

