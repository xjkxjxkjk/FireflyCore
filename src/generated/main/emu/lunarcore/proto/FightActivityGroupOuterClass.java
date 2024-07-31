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

public final class FightActivityGroupOuterClass {
  /**
   * Protobuf type {@code FightActivityGroup}
   */
  public static final class FightActivityGroup extends ProtoMessage<FightActivityGroup> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 passed_max_difficulty_level = 2;</code>
     */
    private int passedMaxDifficultyLevel;

    /**
     * <code>optional uint32 endless_max_wave = 5;</code>
     */
    private int endlessMaxWave;

    /**
     * <code>optional uint32 group_id = 8;</code>
     */
    private int groupId;

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     */
    private final RepeatedInt takenDifficultyLevelRewardList = RepeatedInt.newEmptyInstance();

    private FightActivityGroup() {
    }

    /**
     * @return a new empty instance of {@code FightActivityGroup}
     */
    public static FightActivityGroup newInstance() {
      return new FightActivityGroup();
    }

    /**
     * <code>optional uint32 passed_max_difficulty_level = 2;</code>
     * @return whether the passedMaxDifficultyLevel field is set
     */
    public boolean hasPassedMaxDifficultyLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 passed_max_difficulty_level = 2;</code>
     * @return this
     */
    public FightActivityGroup clearPassedMaxDifficultyLevel() {
      bitField0_ &= ~0x00000001;
      passedMaxDifficultyLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 passed_max_difficulty_level = 2;</code>
     * @return the passedMaxDifficultyLevel
     */
    public int getPassedMaxDifficultyLevel() {
      return passedMaxDifficultyLevel;
    }

    /**
     * <code>optional uint32 passed_max_difficulty_level = 2;</code>
     * @param value the passedMaxDifficultyLevel to set
     * @return this
     */
    public FightActivityGroup setPassedMaxDifficultyLevel(final int value) {
      bitField0_ |= 0x00000001;
      passedMaxDifficultyLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 endless_max_wave = 5;</code>
     * @return whether the endlessMaxWave field is set
     */
    public boolean hasEndlessMaxWave() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 endless_max_wave = 5;</code>
     * @return this
     */
    public FightActivityGroup clearEndlessMaxWave() {
      bitField0_ &= ~0x00000002;
      endlessMaxWave = 0;
      return this;
    }

    /**
     * <code>optional uint32 endless_max_wave = 5;</code>
     * @return the endlessMaxWave
     */
    public int getEndlessMaxWave() {
      return endlessMaxWave;
    }

    /**
     * <code>optional uint32 endless_max_wave = 5;</code>
     * @param value the endlessMaxWave to set
     * @return this
     */
    public FightActivityGroup setEndlessMaxWave(final int value) {
      bitField0_ |= 0x00000002;
      endlessMaxWave = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 8;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 group_id = 8;</code>
     * @return this
     */
    public FightActivityGroup clearGroupId() {
      bitField0_ &= ~0x00000004;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 8;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 8;</code>
     * @param value the groupId to set
     * @return this
     */
    public FightActivityGroup setGroupId(final int value) {
      bitField0_ |= 0x00000004;
      groupId = value;
      return this;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     * @return whether the takenDifficultyLevelRewardList field is set
     */
    public boolean hasTakenDifficultyLevelRewardList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     * @return this
     */
    public FightActivityGroup clearTakenDifficultyLevelRewardList() {
      bitField0_ &= ~0x00000008;
      takenDifficultyLevelRewardList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTakenDifficultyLevelRewardList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getTakenDifficultyLevelRewardList() {
      return takenDifficultyLevelRewardList;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableTakenDifficultyLevelRewardList() {
      bitField0_ |= 0x00000008;
      return takenDifficultyLevelRewardList;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     * @param value the takenDifficultyLevelRewardList to add
     * @return this
     */
    public FightActivityGroup addTakenDifficultyLevelRewardList(final int value) {
      bitField0_ |= 0x00000008;
      takenDifficultyLevelRewardList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 taken_difficulty_level_reward_list = 11;</code>
     * @param values the takenDifficultyLevelRewardList to add
     * @return this
     */
    public FightActivityGroup addAllTakenDifficultyLevelRewardList(final int... values) {
      bitField0_ |= 0x00000008;
      takenDifficultyLevelRewardList.addAll(values);
      return this;
    }

    @Override
    public FightActivityGroup copyFrom(final FightActivityGroup other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        passedMaxDifficultyLevel = other.passedMaxDifficultyLevel;
        endlessMaxWave = other.endlessMaxWave;
        groupId = other.groupId;
        takenDifficultyLevelRewardList.copyFrom(other.takenDifficultyLevelRewardList);
      }
      return this;
    }

    @Override
    public FightActivityGroup mergeFrom(final FightActivityGroup other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPassedMaxDifficultyLevel()) {
        setPassedMaxDifficultyLevel(other.passedMaxDifficultyLevel);
      }
      if (other.hasEndlessMaxWave()) {
        setEndlessMaxWave(other.endlessMaxWave);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasTakenDifficultyLevelRewardList()) {
        getMutableTakenDifficultyLevelRewardList().addAll(other.takenDifficultyLevelRewardList);
      }
      return this;
    }

    @Override
    public FightActivityGroup clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      passedMaxDifficultyLevel = 0;
      endlessMaxWave = 0;
      groupId = 0;
      takenDifficultyLevelRewardList.clear();
      return this;
    }

    @Override
    public FightActivityGroup clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      takenDifficultyLevelRewardList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof FightActivityGroup)) {
        return false;
      }
      FightActivityGroup other = (FightActivityGroup) o;
      return bitField0_ == other.bitField0_
        && (!hasPassedMaxDifficultyLevel() || passedMaxDifficultyLevel == other.passedMaxDifficultyLevel)
        && (!hasEndlessMaxWave() || endlessMaxWave == other.endlessMaxWave)
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasTakenDifficultyLevelRewardList() || takenDifficultyLevelRewardList.equals(other.takenDifficultyLevelRewardList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(passedMaxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(endlessMaxWave);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < takenDifficultyLevelRewardList.length(); i++) {
          output.writeRawByte((byte) 88);
          output.writeUInt32NoTag(takenDifficultyLevelRewardList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(passedMaxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(endlessMaxWave);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * takenDifficultyLevelRewardList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(takenDifficultyLevelRewardList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public FightActivityGroup mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // passedMaxDifficultyLevel
            passedMaxDifficultyLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // endlessMaxWave
            endlessMaxWave = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // takenDifficultyLevelRewardList [packed=true]
            input.readPackedUInt32(takenDifficultyLevelRewardList, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
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
          case 88: {
            // takenDifficultyLevelRewardList [packed=false]
            tag = input.readRepeatedUInt32(takenDifficultyLevelRewardList, tag);
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
        output.writeUInt32(FieldNames.passedMaxDifficultyLevel, passedMaxDifficultyLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.endlessMaxWave, endlessMaxWave);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.takenDifficultyLevelRewardList, takenDifficultyLevelRewardList);
      }
      output.endObject();
    }

    @Override
    public FightActivityGroup mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 556441365:
          case 621527018: {
            if (input.isAtField(FieldNames.passedMaxDifficultyLevel)) {
              if (!input.trySkipNullValue()) {
                passedMaxDifficultyLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1508510999:
          case 994550751: {
            if (input.isAtField(FieldNames.endlessMaxWave)) {
              if (!input.trySkipNullValue()) {
                endlessMaxWave = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -325043505:
          case 1539896423: {
            if (input.isAtField(FieldNames.takenDifficultyLevelRewardList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(takenDifficultyLevelRewardList);
                bitField0_ |= 0x00000008;
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
    public FightActivityGroup clone() {
      return new FightActivityGroup().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static FightActivityGroup parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new FightActivityGroup(), data).checkInitialized();
    }

    public static FightActivityGroup parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FightActivityGroup(), input).checkInitialized();
    }

    public static FightActivityGroup parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new FightActivityGroup(), input).checkInitialized();
    }

    /**
     * @return factory for creating FightActivityGroup messages
     */
    public static MessageFactory<FightActivityGroup> getFactory() {
      return FightActivityGroupFactory.INSTANCE;
    }

    private enum FightActivityGroupFactory implements MessageFactory<FightActivityGroup> {
      INSTANCE;

      @Override
      public FightActivityGroup create() {
        return FightActivityGroup.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName passedMaxDifficultyLevel = FieldName.forField("passedMaxDifficultyLevel", "passed_max_difficulty_level");

      static final FieldName endlessMaxWave = FieldName.forField("endlessMaxWave", "endless_max_wave");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName takenDifficultyLevelRewardList = FieldName.forField("takenDifficultyLevelRewardList", "taken_difficulty_level_reward_list");
    }
  }
}
