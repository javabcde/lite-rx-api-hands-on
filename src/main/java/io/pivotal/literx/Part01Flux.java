package io.pivotal.literx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import reactor.core.publisher.Flux;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

  // TODO Return an empty Flux
  Flux<String> emptyFlux() {
    return Flux.empty();
  }

//========================================================================================

  // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
  Flux<String> fooBarFluxFromValues() {
    return Flux.just("foo", "bar");
  }

//========================================================================================

  // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
  Flux<String> fooBarFluxFromList() {
    String[] strings = new String[]{"foo", "bar"};
    return Flux.fromArray(strings);
  }

//========================================================================================

  // TODO Create a Flux that emits an IllegalStateException
  Flux<String> errorFlux() {
    return Flux.error(new IllegalStateException());
  }

//========================================================================================

  // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
  Flux<Long> counter() {
		return /*Flux.create(fluxSink -> {
			for (int i = 0; i <= 9; i++) {
				fluxSink.next(i);
			}
			fluxSink.complete();
		}).map(i -> Long.valueOf(i.toString()));*/
				Flux.range(0,10).map(i -> Long.valueOf(i.toString()));
  }

}
