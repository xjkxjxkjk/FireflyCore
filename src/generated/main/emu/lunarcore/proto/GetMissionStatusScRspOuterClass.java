// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class GetMissionStatusScRspOuterClass {
  /**
   * Protobuf type {@code GetMissionStatusScRsp}
   */
  public static final class GetMissionStatusScRsp extends ProtoMessage<GetMissionStatusScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  repeated Nmlilpfiidn lpedbojeaid = 8;
     * </pre>
     *
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     */
    private final RepeatedInt finishedMainMissionIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     */
    private final RepeatedInt unfinishedMainMissionIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     */
    private final RepeatedInt disabledMainMissionIdList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     */
    private final RepeatedMessage<MissionOuterClass.Mission> subMissionStatusList = RepeatedMessage.newEmptyInstance(MissionOuterClass.Mission.getFactory());

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     */
    private final RepeatedMessage<MissionOuterClass.Mission> missionEventStatusList = RepeatedMessage.newEmptyInstance(MissionOuterClass.Mission.getFactory());

    private GetMissionStatusScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetMissionStatusScRsp}
     */
    public static GetMissionStatusScRsp newInstance() {
      return new GetMissionStatusScRsp();
    }

    /**
     * <pre>
     *  repeated Nmlilpfiidn lpedbojeaid = 8;
     * </pre>
     *
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  repeated Nmlilpfiidn lpedbojeaid = 8;
     * </pre>
     *
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <pre>
     *  repeated Nmlilpfiidn lpedbojeaid = 8;
     * </pre>
     *
     * <code>optional uint32 retcode = 9;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <pre>
     *  repeated Nmlilpfiidn lpedbojeaid = 8;
     * </pre>
     *
     * <code>optional uint32 retcode = 9;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetMissionStatusScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     * @return whether the finishedMainMissionIdList field is set
     */
    public boolean hasFinishedMainMissionIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearFinishedMainMissionIdList() {
      bitField0_ &= ~0x00000002;
      finishedMainMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFinishedMainMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFinishedMainMissionIdList() {
      return finishedMainMissionIdList;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFinishedMainMissionIdList() {
      bitField0_ |= 0x00000002;
      return finishedMainMissionIdList;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     * @param value the finishedMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addFinishedMainMissionIdList(final int value) {
      bitField0_ |= 0x00000002;
      finishedMainMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 finished_main_mission_id_list = 7;</code>
     * @param values the finishedMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addAllFinishedMainMissionIdList(final int... values) {
      bitField0_ |= 0x00000002;
      finishedMainMissionIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     * @return whether the unfinishedMainMissionIdList field is set
     */
    public boolean hasUnfinishedMainMissionIdList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearUnfinishedMainMissionIdList() {
      bitField0_ &= ~0x00000004;
      unfinishedMainMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnfinishedMainMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnfinishedMainMissionIdList() {
      return unfinishedMainMissionIdList;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnfinishedMainMissionIdList() {
      bitField0_ |= 0x00000004;
      return unfinishedMainMissionIdList;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     * @param value the unfinishedMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addUnfinishedMainMissionIdList(final int value) {
      bitField0_ |= 0x00000004;
      unfinishedMainMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 unfinished_main_mission_id_list = 10;</code>
     * @param values the unfinishedMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addAllUnfinishedMainMissionIdList(final int... values) {
      bitField0_ |= 0x00000004;
      unfinishedMainMissionIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     * @return whether the disabledMainMissionIdList field is set
     */
    public boolean hasDisabledMainMissionIdList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearDisabledMainMissionIdList() {
      bitField0_ &= ~0x00000008;
      disabledMainMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDisabledMainMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getDisabledMainMissionIdList() {
      return disabledMainMissionIdList;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableDisabledMainMissionIdList() {
      bitField0_ |= 0x00000008;
      return disabledMainMissionIdList;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     * @param value the disabledMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addDisabledMainMissionIdList(final int value) {
      bitField0_ |= 0x00000008;
      disabledMainMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 disabled_main_mission_id_list = 15;</code>
     * @param values the disabledMainMissionIdList to add
     * @return this
     */
    public GetMissionStatusScRsp addAllDisabledMainMissionIdList(final int... values) {
      bitField0_ |= 0x00000008;
      disabledMainMissionIdList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     * @return whether the subMissionStatusList field is set
     */
    public boolean hasSubMissionStatusList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearSubMissionStatusList() {
      bitField0_ &= ~0x00000010;
      subMissionStatusList.clear();
      return this;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubMissionStatusList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MissionOuterClass.Mission> getSubMissionStatusList() {
      return subMissionStatusList;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MissionOuterClass.Mission> getMutableSubMissionStatusList() {
      bitField0_ |= 0x00000010;
      return subMissionStatusList;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     * @param value the subMissionStatusList to add
     * @return this
     */
    public GetMissionStatusScRsp addSubMissionStatusList(final MissionOuterClass.Mission value) {
      bitField0_ |= 0x00000010;
      subMissionStatusList.add(value);
      return this;
    }

    /**
     * <code>repeated .Mission sub_mission_status_list = 4;</code>
     * @param values the subMissionStatusList to add
     * @return this
     */
    public GetMissionStatusScRsp addAllSubMissionStatusList(
        final MissionOuterClass.Mission... values) {
      bitField0_ |= 0x00000010;
      subMissionStatusList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     * @return whether the missionEventStatusList field is set
     */
    public boolean hasMissionEventStatusList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     * @return this
     */
    public GetMissionStatusScRsp clearMissionEventStatusList() {
      bitField0_ &= ~0x00000020;
      missionEventStatusList.clear();
      return this;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMissionEventStatusList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MissionOuterClass.Mission> getMissionEventStatusList() {
      return missionEventStatusList;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MissionOuterClass.Mission> getMutableMissionEventStatusList() {
      bitField0_ |= 0x00000020;
      return missionEventStatusList;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     * @param value the missionEventStatusList to add
     * @return this
     */
    public GetMissionStatusScRsp addMissionEventStatusList(final MissionOuterClass.Mission value) {
      bitField0_ |= 0x00000020;
      missionEventStatusList.add(value);
      return this;
    }

    /**
     * <code>repeated .Mission mission_event_status_list = 12;</code>
     * @param values the missionEventStatusList to add
     * @return this
     */
    public GetMissionStatusScRsp addAllMissionEventStatusList(
        final MissionOuterClass.Mission... values) {
      bitField0_ |= 0x00000020;
      missionEventStatusList.addAll(values);
      return this;
    }

    @Override
    public GetMissionStatusScRsp copyFrom(final GetMissionStatusScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        finishedMainMissionIdList.copyFrom(other.finishedMainMissionIdList);
        unfinishedMainMissionIdList.copyFrom(other.unfinishedMainMissionIdList);
        disabledMainMissionIdList.copyFrom(other.disabledMainMissionIdList);
        subMissionStatusList.copyFrom(other.subMissionStatusList);
        missionEventStatusList.copyFrom(other.missionEventStatusList);
      }
      return this;
    }

    @Override
    public GetMissionStatusScRsp mergeFrom(final GetMissionStatusScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasFinishedMainMissionIdList()) {
        getMutableFinishedMainMissionIdList().addAll(other.finishedMainMissionIdList);
      }
      if (other.hasUnfinishedMainMissionIdList()) {
        getMutableUnfinishedMainMissionIdList().addAll(other.unfinishedMainMissionIdList);
      }
      if (other.hasDisabledMainMissionIdList()) {
        getMutableDisabledMainMissionIdList().addAll(other.disabledMainMissionIdList);
      }
      if (other.hasSubMissionStatusList()) {
        getMutableSubMissionStatusList().addAll(other.subMissionStatusList);
      }
      if (other.hasMissionEventStatusList()) {
        getMutableMissionEventStatusList().addAll(other.missionEventStatusList);
      }
      return this;
    }

    @Override
    public GetMissionStatusScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      finishedMainMissionIdList.clear();
      unfinishedMainMissionIdList.clear();
      disabledMainMissionIdList.clear();
      subMissionStatusList.clear();
      missionEventStatusList.clear();
      return this;
    }

    @Override
    public GetMissionStatusScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      finishedMainMissionIdList.clear();
      unfinishedMainMissionIdList.clear();
      disabledMainMissionIdList.clear();
      subMissionStatusList.clearQuick();
      missionEventStatusList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMissionStatusScRsp)) {
        return false;
      }
      GetMissionStatusScRsp other = (GetMissionStatusScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasFinishedMainMissionIdList() || finishedMainMissionIdList.equals(other.finishedMainMissionIdList))
        && (!hasUnfinishedMainMissionIdList() || unfinishedMainMissionIdList.equals(other.unfinishedMainMissionIdList))
        && (!hasDisabledMainMissionIdList() || disabledMainMissionIdList.equals(other.disabledMainMissionIdList))
        && (!hasSubMissionStatusList() || subMissionStatusList.equals(other.subMissionStatusList))
        && (!hasMissionEventStatusList() || missionEventStatusList.equals(other.missionEventStatusList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < finishedMainMissionIdList.length(); i++) {
          output.writeRawByte((byte) 56);
          output.writeUInt32NoTag(finishedMainMissionIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < unfinishedMainMissionIdList.length(); i++) {
          output.writeRawByte((byte) 80);
          output.writeUInt32NoTag(unfinishedMainMissionIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < disabledMainMissionIdList.length(); i++) {
          output.writeRawByte((byte) 120);
          output.writeUInt32NoTag(disabledMainMissionIdList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < subMissionStatusList.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(subMissionStatusList.get(i));
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < missionEventStatusList.length(); i++) {
          output.writeRawByte((byte) 98);
          output.writeMessageNoTag(missionEventStatusList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * finishedMainMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(finishedMainMissionIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * unfinishedMainMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unfinishedMainMissionIdList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * disabledMainMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(disabledMainMissionIdList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * subMissionStatusList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subMissionStatusList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * missionEventStatusList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(missionEventStatusList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMissionStatusScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 58) {
              break;
            }
          }
          case 58: {
            // finishedMainMissionIdList [packed=true]
            input.readPackedUInt32(finishedMainMissionIdList, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // unfinishedMainMissionIdList [packed=true]
            input.readPackedUInt32(unfinishedMainMissionIdList, tag);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // disabledMainMissionIdList [packed=true]
            input.readPackedUInt32(disabledMainMissionIdList, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // subMissionStatusList
            tag = input.readRepeatedMessage(subMissionStatusList, tag);
            bitField0_ |= 0x00000010;
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // missionEventStatusList
            tag = input.readRepeatedMessage(missionEventStatusList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 56: {
            // finishedMainMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(finishedMainMissionIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
          case 80: {
            // unfinishedMainMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(unfinishedMainMissionIdList, tag);
            bitField0_ |= 0x00000004;
            break;
          }
          case 120: {
            // disabledMainMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(disabledMainMissionIdList, tag);
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.finishedMainMissionIdList, finishedMainMissionIdList);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedUInt32(FieldNames.unfinishedMainMissionIdList, unfinishedMainMissionIdList);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.disabledMainMissionIdList, disabledMainMissionIdList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedMessage(FieldNames.subMissionStatusList, subMissionStatusList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.missionEventStatusList, missionEventStatusList);
      }
      output.endObject();
    }

    @Override
    public GetMissionStatusScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 104231290:
          case -1929023306: {
            if (input.isAtField(FieldNames.finishedMainMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(finishedMainMissionIdList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 61133057:
          case 1704637629: {
            if (input.isAtField(FieldNames.unfinishedMainMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unfinishedMainMissionIdList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 83823792:
          case 1929478380: {
            if (input.isAtField(FieldNames.disabledMainMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(disabledMainMissionIdList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1842850820:
          case 1165580825: {
            if (input.isAtField(FieldNames.subMissionStatusList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subMissionStatusList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 582053566:
          case 1494751923: {
            if (input.isAtField(FieldNames.missionEventStatusList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(missionEventStatusList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetMissionStatusScRsp clone() {
      return new GetMissionStatusScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMissionStatusScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMissionStatusScRsp(), data).checkInitialized();
    }

    public static GetMissionStatusScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMissionStatusScRsp(), input).checkInitialized();
    }

    public static GetMissionStatusScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetMissionStatusScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMissionStatusScRsp messages
     */
    public static MessageFactory<GetMissionStatusScRsp> getFactory() {
      return GetMissionStatusScRspFactory.INSTANCE;
    }

    private enum GetMissionStatusScRspFactory implements MessageFactory<GetMissionStatusScRsp> {
      INSTANCE;

      @Override
      public GetMissionStatusScRsp create() {
        return GetMissionStatusScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName finishedMainMissionIdList = FieldName.forField("finishedMainMissionIdList", "finished_main_mission_id_list");

      static final FieldName unfinishedMainMissionIdList = FieldName.forField("unfinishedMainMissionIdList", "unfinished_main_mission_id_list");

      static final FieldName disabledMainMissionIdList = FieldName.forField("disabledMainMissionIdList", "disabled_main_mission_id_list");

      static final FieldName subMissionStatusList = FieldName.forField("subMissionStatusList", "sub_mission_status_list");

      static final FieldName missionEventStatusList = FieldName.forField("missionEventStatusList", "mission_event_status_list");
    }
  }
}
