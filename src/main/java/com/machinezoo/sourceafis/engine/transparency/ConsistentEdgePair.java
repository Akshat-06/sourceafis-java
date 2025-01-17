// Part of SourceAFIS for Java: https://sourceafis.machinezoo.com/java
package com.machinezoo.sourceafis.engine.transparency;

import com.machinezoo.sourceafis.engine.matcher.*;

public class ConsistentEdgePair {
	public int probeFrom;
	public int probeTo;
	public int candidateFrom;
	public int candidateTo;
	public ConsistentEdgePair(MinutiaPair pair) {
		probeFrom = pair.probeRef;
		probeTo = pair.probe;
		candidateFrom = pair.candidateRef;
		candidateTo = pair.candidate;
	}
}
