# MappingProcessor

~~~java
private Iterable<ModelElementProcessor<?, ?>> getProcessors() {
        // TODO Re-consider which class loader to use in case processors are
        // loaded from other modules, too
        @SuppressWarnings("rawtypes")
        Iterator<ModelElementProcessor> processorIterator = ServiceLoader.load(
            ModelElementProcessor.class,
            MappingProcessor.class.getClassLoader()
        )
            .iterator();
        List<ModelElementProcessor<?, ?>> processors = new ArrayList<>();

        while ( processorIterator.hasNext() ) {
            processors.add( processorIterator.next() );
        }

        Collections.sort( processors, new ProcessorComparator() );

        return processors;
    }
~~~

: ProcessorComparator ModelElementProcessor의 getPriority를 기준으로 정렬 


## ModelElementProcessor

## AnnotationBasedComponentModelProcessor

### SpringComponentProcessor


## MapperRenderingProcessor

## MapperCreationProcessor