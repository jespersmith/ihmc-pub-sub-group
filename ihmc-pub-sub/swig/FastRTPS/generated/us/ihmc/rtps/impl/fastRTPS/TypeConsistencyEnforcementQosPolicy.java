/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class TypeConsistencyEnforcementQosPolicy extends QosPolicy {
  private transient long swigCPtr;

  protected TypeConsistencyEnforcementQosPolicy(long cPtr, boolean cMemoryOwn) {
    super(FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypeConsistencyEnforcementQosPolicy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_TypeConsistencyEnforcementQosPolicy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_kind(TypeConsistencyKind value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_kind_set(swigCPtr, this, value.swigValue());
  }

  public TypeConsistencyKind getM_kind() {
    return TypeConsistencyKind.swigToEnum(FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_kind_get(swigCPtr, this));
  }

  public void setM_ignore_sequence_bounds(boolean value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_sequence_bounds_set(swigCPtr, this, value);
  }

  public boolean getM_ignore_sequence_bounds() {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_sequence_bounds_get(swigCPtr, this);
  }

  public void setM_ignore_string_bounds(boolean value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_string_bounds_set(swigCPtr, this, value);
  }

  public boolean getM_ignore_string_bounds() {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_string_bounds_get(swigCPtr, this);
  }

  public void setM_ignore_member_names(boolean value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_member_names_set(swigCPtr, this, value);
  }

  public boolean getM_ignore_member_names() {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_ignore_member_names_get(swigCPtr, this);
  }

  public void setM_prevent_type_widening(boolean value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_prevent_type_widening_set(swigCPtr, this, value);
  }

  public boolean getM_prevent_type_widening() {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_prevent_type_widening_get(swigCPtr, this);
  }

  public void setM_force_type_validation(boolean value) {
    FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_force_type_validation_set(swigCPtr, this, value);
  }

  public boolean getM_force_type_validation() {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_m_force_type_validation_get(swigCPtr, this);
  }

  public TypeConsistencyEnforcementQosPolicy() {
    this(FastRTPSJNI.new_TypeConsistencyEnforcementQosPolicy(), true);
  }

  public boolean addToCDRMessage(SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t msg) {
    return FastRTPSJNI.TypeConsistencyEnforcementQosPolicy_addToCDRMessage(swigCPtr, this, SWIGTYPE_p_eprosima__fastrtps__rtps__CDRMessage_t.getCPtr(msg));
  }

}
