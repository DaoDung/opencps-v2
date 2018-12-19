package org.opencps.statistic.rest.engine.service;

import java.util.Map;

import org.opencps.statistic.rest.dto.DossierStatisticData;
import org.opencps.statistic.rest.dto.VotingResultStatisticData;

public class StatisticEngineUpdate {
	public void updateStatisticData(Map<String, DossierStatisticData> statisticData) {

		StatisticEngineUpdateAction engineUpdateAction = new StatisticEngineUpdateAction();

		for (Map.Entry me : statisticData.entrySet()) {

			DossierStatisticData payload = (DossierStatisticData) me.getValue();

			engineUpdateAction.updateStatistic(payload);

		}

	}

	public void updateVotingStatisticData(Map<String, VotingResultStatisticData> votingData) {

		StatisticEngineUpdateAction engineUpdateAction = new StatisticEngineUpdateAction();

		for (Map.Entry<String, VotingResultStatisticData> me : votingData.entrySet()) {

			VotingResultStatisticData payload = me.getValue();

			engineUpdateAction.updateVotingStatistic(payload);

		}

	}
}
