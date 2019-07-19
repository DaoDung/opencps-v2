/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import org.opencps.dossiermgt.model.DossierActionUser;
import org.opencps.dossiermgt.service.persistence.DossierActionUserPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DossierActionUser in entity cache.
 *
 * @author huymq
 * @see DossierActionUser
 * @generated
 */
@ProviderType
public class DossierActionUserCacheModel implements CacheModel<DossierActionUser>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierActionUserCacheModel)) {
			return false;
		}

		DossierActionUserCacheModel dossierActionUserCacheModel = (DossierActionUserCacheModel)obj;

		if (dossierActionUserPK.equals(
					dossierActionUserCacheModel.dossierActionUserPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dossierActionUserPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierActionId=");
		sb.append(dossierActionId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", stepCode=");
		sb.append(stepCode);
		sb.append(", moderator=");
		sb.append(moderator);
		sb.append(", assigned=");
		sb.append(assigned);
		sb.append(", visited=");
		sb.append(visited);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append(", delegacy=");
		sb.append(delegacy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DossierActionUser toEntityModel() {
		DossierActionUserImpl dossierActionUserImpl = new DossierActionUserImpl();

		if (uuid == null) {
			dossierActionUserImpl.setUuid("");
		}
		else {
			dossierActionUserImpl.setUuid(uuid);
		}

		dossierActionUserImpl.setDossierActionId(dossierActionId);
		dossierActionUserImpl.setUserId(userId);
		dossierActionUserImpl.setDossierId(dossierId);

		if (stepCode == null) {
			dossierActionUserImpl.setStepCode("");
		}
		else {
			dossierActionUserImpl.setStepCode(stepCode);
		}

		dossierActionUserImpl.setModerator(moderator);
		dossierActionUserImpl.setAssigned(assigned);
		dossierActionUserImpl.setVisited(visited);
		dossierActionUserImpl.setRoleId(roleId);
		dossierActionUserImpl.setDelegacy(delegacy);

		dossierActionUserImpl.resetOriginalValues();

		return dossierActionUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dossierActionId = objectInput.readLong();

		userId = objectInput.readLong();

		dossierId = objectInput.readLong();
		stepCode = objectInput.readUTF();

		moderator = objectInput.readInt();

		assigned = objectInput.readInt();

		visited = objectInput.readBoolean();

		roleId = objectInput.readLong();

		delegacy = objectInput.readInt();

		dossierActionUserPK = new DossierActionUserPK(dossierActionId, userId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dossierActionId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(dossierId);

		if (stepCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stepCode);
		}

		objectOutput.writeInt(moderator);

		objectOutput.writeInt(assigned);

		objectOutput.writeBoolean(visited);

		objectOutput.writeLong(roleId);

		objectOutput.writeInt(delegacy);
	}

	public String uuid;
	public long dossierActionId;
	public long userId;
	public long dossierId;
	public String stepCode;
	public int moderator;
	public int assigned;
	public boolean visited;
	public long roleId;
	public int delegacy;
	public transient DossierActionUserPK dossierActionUserPK;
}