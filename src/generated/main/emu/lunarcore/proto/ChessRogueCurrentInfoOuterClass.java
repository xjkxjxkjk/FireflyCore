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
import us.hebi.quickbuf.RepeatedMessage;

public final class ChessRogueCurrentInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueCurrentInfo}
   */
  public static final class ChessRogueCurrentInfo extends ProtoMessage<ChessRogueCurrentInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 rogue_version_id = 6;</code>
     */
    private int rogueVersionId;

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     */
    private final ChessRogueNousValueOuterClass.ChessRogueNousValue nousValue = ChessRogueNousValueOuterClass.ChessRogueNousValue.newInstance();

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     */
    private final ChessRogueAvatarInfoOuterClass.ChessRogueAvatarInfo rogueAvatarInfo = ChessRogueAvatarInfoOuterClass.ChessRogueAvatarInfo.newInstance();

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     */
    private final ChessRogueNousStoryInfoOuterClass.ChessRogueNousStoryInfo startInfo = ChessRogueNousStoryInfoOuterClass.ChessRogueNousStoryInfo.newInstance();

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     */
    private final RogueCommonPendingActionOuterClass.RogueCommonPendingAction pendingAction = RogueCommonPendingActionOuterClass.RogueCommonPendingAction.newInstance();

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     */
    private final ChessRogueBuffInfoOuterClass.ChessRogueBuffInfo buffInfo = ChessRogueBuffInfoOuterClass.ChessRogueBuffInfo.newInstance();

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     */
    private final ChessRogueMiracleInfoOuterClass.ChessRogueMiracleInfo miracleInfo = ChessRogueMiracleInfoOuterClass.ChessRogueMiracleInfo.newInstance();

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     */
    private final ChessRogueNousDiceOuterClass.ChessRogueNousDice diceInfo = ChessRogueNousDiceOuterClass.ChessRogueNousDice.newInstance();

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     */
    private final RepeatedMessage<ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo> virtualItemInfo = RepeatedMessage.newEmptyInstance(ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo.getFactory());

    private ChessRogueCurrentInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueCurrentInfo}
     */
    public static ChessRogueCurrentInfo newInstance() {
      return new ChessRogueCurrentInfo();
    }

    /**
     * <code>optional uint32 rogue_version_id = 6;</code>
     * @return whether the rogueVersionId field is set
     */
    public boolean hasRogueVersionId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 rogue_version_id = 6;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearRogueVersionId() {
      bitField0_ &= ~0x00000001;
      rogueVersionId = 0;
      return this;
    }

    /**
     * <code>optional uint32 rogue_version_id = 6;</code>
     * @return the rogueVersionId
     */
    public int getRogueVersionId() {
      return rogueVersionId;
    }

    /**
     * <code>optional uint32 rogue_version_id = 6;</code>
     * @param value the rogueVersionId to set
     * @return this
     */
    public ChessRogueCurrentInfo setRogueVersionId(final int value) {
      bitField0_ |= 0x00000001;
      rogueVersionId = value;
      return this;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     * @return whether the nousValue field is set
     */
    public boolean hasNousValue() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearNousValue() {
      bitField0_ &= ~0x00000002;
      nousValue.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNousValue()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousValueOuterClass.ChessRogueNousValue getNousValue() {
      return nousValue;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousValueOuterClass.ChessRogueNousValue getMutableNousValue() {
      bitField0_ |= 0x00000002;
      return nousValue;
    }

    /**
     * <code>optional .ChessRogueNousValue nous_value = 1;</code>
     * @param value the nousValue to set
     * @return this
     */
    public ChessRogueCurrentInfo setNousValue(
        final ChessRogueNousValueOuterClass.ChessRogueNousValue value) {
      bitField0_ |= 0x00000002;
      nousValue.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     * @return whether the rogueAvatarInfo field is set
     */
    public boolean hasRogueAvatarInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearRogueAvatarInfo() {
      bitField0_ &= ~0x00000004;
      rogueAvatarInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRogueAvatarInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueAvatarInfoOuterClass.ChessRogueAvatarInfo getRogueAvatarInfo() {
      return rogueAvatarInfo;
    }

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueAvatarInfoOuterClass.ChessRogueAvatarInfo getMutableRogueAvatarInfo() {
      bitField0_ |= 0x00000004;
      return rogueAvatarInfo;
    }

    /**
     * <code>optional .ChessRogueAvatarInfo rogue_avatar_info = 9;</code>
     * @param value the rogueAvatarInfo to set
     * @return this
     */
    public ChessRogueCurrentInfo setRogueAvatarInfo(
        final ChessRogueAvatarInfoOuterClass.ChessRogueAvatarInfo value) {
      bitField0_ |= 0x00000004;
      rogueAvatarInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     * @return whether the startInfo field is set
     */
    public boolean hasStartInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearStartInfo() {
      bitField0_ &= ~0x00000008;
      startInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableStartInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousStoryInfoOuterClass.ChessRogueNousStoryInfo getStartInfo() {
      return startInfo;
    }

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousStoryInfoOuterClass.ChessRogueNousStoryInfo getMutableStartInfo() {
      bitField0_ |= 0x00000008;
      return startInfo;
    }

    /**
     * <code>optional .ChessRogueNousStoryInfo start_info = 10;</code>
     * @param value the startInfo to set
     * @return this
     */
    public ChessRogueCurrentInfo setStartInfo(
        final ChessRogueNousStoryInfoOuterClass.ChessRogueNousStoryInfo value) {
      bitField0_ |= 0x00000008;
      startInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     * @return whether the pendingAction field is set
     */
    public boolean hasPendingAction() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearPendingAction() {
      bitField0_ &= ~0x00000010;
      pendingAction.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePendingAction()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonPendingActionOuterClass.RogueCommonPendingAction getPendingAction() {
      return pendingAction;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonPendingActionOuterClass.RogueCommonPendingAction getMutablePendingAction() {
      bitField0_ |= 0x00000010;
      return pendingAction;
    }

    /**
     * <code>optional .RogueCommonPendingAction pending_action = 11;</code>
     * @param value the pendingAction to set
     * @return this
     */
    public ChessRogueCurrentInfo setPendingAction(
        final RogueCommonPendingActionOuterClass.RogueCommonPendingAction value) {
      bitField0_ |= 0x00000010;
      pendingAction.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     * @return whether the buffInfo field is set
     */
    public boolean hasBuffInfo() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearBuffInfo() {
      bitField0_ &= ~0x00000020;
      buffInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueBuffInfoOuterClass.ChessRogueBuffInfo getBuffInfo() {
      return buffInfo;
    }

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueBuffInfoOuterClass.ChessRogueBuffInfo getMutableBuffInfo() {
      bitField0_ |= 0x00000020;
      return buffInfo;
    }

    /**
     * <code>optional .ChessRogueBuffInfo buff_info = 12;</code>
     * @param value the buffInfo to set
     * @return this
     */
    public ChessRogueCurrentInfo setBuffInfo(
        final ChessRogueBuffInfoOuterClass.ChessRogueBuffInfo value) {
      bitField0_ |= 0x00000020;
      buffInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     * @return whether the miracleInfo field is set
     */
    public boolean hasMiracleInfo() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearMiracleInfo() {
      bitField0_ &= ~0x00000040;
      miracleInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMiracleInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueMiracleInfoOuterClass.ChessRogueMiracleInfo getMiracleInfo() {
      return miracleInfo;
    }

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueMiracleInfoOuterClass.ChessRogueMiracleInfo getMutableMiracleInfo() {
      bitField0_ |= 0x00000040;
      return miracleInfo;
    }

    /**
     * <code>optional .ChessRogueMiracleInfo miracle_info = 14;</code>
     * @param value the miracleInfo to set
     * @return this
     */
    public ChessRogueCurrentInfo setMiracleInfo(
        final ChessRogueMiracleInfoOuterClass.ChessRogueMiracleInfo value) {
      bitField0_ |= 0x00000040;
      miracleInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     * @return whether the diceInfo field is set
     */
    public boolean hasDiceInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearDiceInfo() {
      bitField0_ &= ~0x00000080;
      diceInfo.clear();
      return this;
    }

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDiceInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getDiceInfo() {
      return diceInfo;
    }

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChessRogueNousDiceOuterClass.ChessRogueNousDice getMutableDiceInfo() {
      bitField0_ |= 0x00000080;
      return diceInfo;
    }

    /**
     * <code>optional .ChessRogueNousDice dice_info = 15;</code>
     * @param value the diceInfo to set
     * @return this
     */
    public ChessRogueCurrentInfo setDiceInfo(
        final ChessRogueNousDiceOuterClass.ChessRogueNousDice value) {
      bitField0_ |= 0x00000080;
      diceInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     * @return whether the virtualItemInfo field is set
     */
    public boolean hasVirtualItemInfo() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     * @return this
     */
    public ChessRogueCurrentInfo clearVirtualItemInfo() {
      bitField0_ &= ~0x00000100;
      virtualItemInfo.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableVirtualItemInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo> getVirtualItemInfo(
        ) {
      return virtualItemInfo;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo> getMutableVirtualItemInfo(
        ) {
      bitField0_ |= 0x00000100;
      return virtualItemInfo;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     * @param value the virtualItemInfo to add
     * @return this
     */
    public ChessRogueCurrentInfo addVirtualItemInfo(
        final ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo value) {
      bitField0_ |= 0x00000100;
      virtualItemInfo.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueVirtualItemInfo virtual_item_info = 4;</code>
     * @param values the virtualItemInfo to add
     * @return this
     */
    public ChessRogueCurrentInfo addAllVirtualItemInfo(
        final ChessRogueVirtualItemInfoOuterClass.ChessRogueVirtualItemInfo... values) {
      bitField0_ |= 0x00000100;
      virtualItemInfo.addAll(values);
      return this;
    }

    @Override
    public ChessRogueCurrentInfo copyFrom(final ChessRogueCurrentInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueVersionId = other.rogueVersionId;
        nousValue.copyFrom(other.nousValue);
        rogueAvatarInfo.copyFrom(other.rogueAvatarInfo);
        startInfo.copyFrom(other.startInfo);
        pendingAction.copyFrom(other.pendingAction);
        buffInfo.copyFrom(other.buffInfo);
        miracleInfo.copyFrom(other.miracleInfo);
        diceInfo.copyFrom(other.diceInfo);
        virtualItemInfo.copyFrom(other.virtualItemInfo);
      }
      return this;
    }

    @Override
    public ChessRogueCurrentInfo mergeFrom(final ChessRogueCurrentInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueVersionId()) {
        setRogueVersionId(other.rogueVersionId);
      }
      if (other.hasNousValue()) {
        getMutableNousValue().mergeFrom(other.nousValue);
      }
      if (other.hasRogueAvatarInfo()) {
        getMutableRogueAvatarInfo().mergeFrom(other.rogueAvatarInfo);
      }
      if (other.hasStartInfo()) {
        getMutableStartInfo().mergeFrom(other.startInfo);
      }
      if (other.hasPendingAction()) {
        getMutablePendingAction().mergeFrom(other.pendingAction);
      }
      if (other.hasBuffInfo()) {
        getMutableBuffInfo().mergeFrom(other.buffInfo);
      }
      if (other.hasMiracleInfo()) {
        getMutableMiracleInfo().mergeFrom(other.miracleInfo);
      }
      if (other.hasDiceInfo()) {
        getMutableDiceInfo().mergeFrom(other.diceInfo);
      }
      if (other.hasVirtualItemInfo()) {
        getMutableVirtualItemInfo().addAll(other.virtualItemInfo);
      }
      return this;
    }

    @Override
    public ChessRogueCurrentInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueVersionId = 0;
      nousValue.clear();
      rogueAvatarInfo.clear();
      startInfo.clear();
      pendingAction.clear();
      buffInfo.clear();
      miracleInfo.clear();
      diceInfo.clear();
      virtualItemInfo.clear();
      return this;
    }

    @Override
    public ChessRogueCurrentInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nousValue.clearQuick();
      rogueAvatarInfo.clearQuick();
      startInfo.clearQuick();
      pendingAction.clearQuick();
      buffInfo.clearQuick();
      miracleInfo.clearQuick();
      diceInfo.clearQuick();
      virtualItemInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueCurrentInfo)) {
        return false;
      }
      ChessRogueCurrentInfo other = (ChessRogueCurrentInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueVersionId() || rogueVersionId == other.rogueVersionId)
        && (!hasNousValue() || nousValue.equals(other.nousValue))
        && (!hasRogueAvatarInfo() || rogueAvatarInfo.equals(other.rogueAvatarInfo))
        && (!hasStartInfo() || startInfo.equals(other.startInfo))
        && (!hasPendingAction() || pendingAction.equals(other.pendingAction))
        && (!hasBuffInfo() || buffInfo.equals(other.buffInfo))
        && (!hasMiracleInfo() || miracleInfo.equals(other.miracleInfo))
        && (!hasDiceInfo() || diceInfo.equals(other.diceInfo))
        && (!hasVirtualItemInfo() || virtualItemInfo.equals(other.virtualItemInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(rogueVersionId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(nousValue);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(startInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(pendingAction);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(buffInfo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 114);
        output.writeMessageNoTag(miracleInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(diceInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < virtualItemInfo.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(virtualItemInfo.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueVersionId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nousValue);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(startInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(pendingAction);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(buffInfo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(miracleInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(diceInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * virtualItemInfo.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(virtualItemInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueCurrentInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // rogueVersionId
            rogueVersionId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // nousValue
            input.readMessage(nousValue);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // rogueAvatarInfo
            input.readMessage(rogueAvatarInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // startInfo
            input.readMessage(startInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 90) {
              break;
            }
          }
          case 90: {
            // pendingAction
            input.readMessage(pendingAction);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // buffInfo
            input.readMessage(buffInfo);
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // miracleInfo
            input.readMessage(miracleInfo);
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 122) {
              break;
            }
          }
          case 122: {
            // diceInfo
            input.readMessage(diceInfo);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // virtualItemInfo
            tag = input.readRepeatedMessage(virtualItemInfo, tag);
            bitField0_ |= 0x00000100;
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.rogueVersionId, rogueVersionId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.nousValue, nousValue);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.rogueAvatarInfo, rogueAvatarInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.startInfo, startInfo);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeMessage(FieldNames.pendingAction, pendingAction);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeMessage(FieldNames.buffInfo, buffInfo);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeMessage(FieldNames.miracleInfo, miracleInfo);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.diceInfo, diceInfo);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.virtualItemInfo, virtualItemInfo);
      }
      output.endObject();
    }

    @Override
    public ChessRogueCurrentInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1457526951:
          case 1832096103: {
            if (input.isAtField(FieldNames.rogueVersionId)) {
              if (!input.trySkipNullValue()) {
                rogueVersionId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1234555758:
          case 660197713: {
            if (input.isAtField(FieldNames.nousValue)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nousValue);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1966631135:
          case 667955439: {
            if (input.isAtField(FieldNames.rogueAvatarInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rogueAvatarInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2129617872:
          case -1573468565: {
            if (input.isAtField(FieldNames.startInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(startInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -110680403:
          case 1646545374: {
            if (input.isAtField(FieldNames.pendingAction)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(pendingAction);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1522874463:
          case 55707930: {
            if (input.isAtField(FieldNames.buffInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(buffInfo);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 760306879:
          case 2114852796: {
            if (input.isAtField(FieldNames.miracleInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(miracleInfo);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -184174347:
          case -1394261434: {
            if (input.isAtField(FieldNames.diceInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(diceInfo);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 892328588:
          case -207708634: {
            if (input.isAtField(FieldNames.virtualItemInfo)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(virtualItemInfo);
                bitField0_ |= 0x00000100;
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
    public ChessRogueCurrentInfo clone() {
      return new ChessRogueCurrentInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueCurrentInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueCurrentInfo(), data).checkInitialized();
    }

    public static ChessRogueCurrentInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCurrentInfo(), input).checkInitialized();
    }

    public static ChessRogueCurrentInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueCurrentInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueCurrentInfo messages
     */
    public static MessageFactory<ChessRogueCurrentInfo> getFactory() {
      return ChessRogueCurrentInfoFactory.INSTANCE;
    }

    private enum ChessRogueCurrentInfoFactory implements MessageFactory<ChessRogueCurrentInfo> {
      INSTANCE;

      @Override
      public ChessRogueCurrentInfo create() {
        return ChessRogueCurrentInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueVersionId = FieldName.forField("rogueVersionId", "rogue_version_id");

      static final FieldName nousValue = FieldName.forField("nousValue", "nous_value");

      static final FieldName rogueAvatarInfo = FieldName.forField("rogueAvatarInfo", "rogue_avatar_info");

      static final FieldName startInfo = FieldName.forField("startInfo", "start_info");

      static final FieldName pendingAction = FieldName.forField("pendingAction", "pending_action");

      static final FieldName buffInfo = FieldName.forField("buffInfo", "buff_info");

      static final FieldName miracleInfo = FieldName.forField("miracleInfo", "miracle_info");

      static final FieldName diceInfo = FieldName.forField("diceInfo", "dice_info");

      static final FieldName virtualItemInfo = FieldName.forField("virtualItemInfo", "virtual_item_info");
    }
  }
}
