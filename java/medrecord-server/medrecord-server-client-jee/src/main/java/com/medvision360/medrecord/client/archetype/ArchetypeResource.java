// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.archetype;

import org.restlet.Client;
import org.restlet.data.Language;
import org.restlet.data.Preference;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.medvision360.lib.client.ClientResourceBase;
import com.medvision360.lib.client.ClientResourceConfig;
import com.medvision360.lib.client.ErrorDocument;
import com.medvision360.lib.common.exceptions.AnnotatedResourceException;
import com.medvision360.lib.common.exceptions.ApiException;

/**
    @apipath /archetype/{id}
 @apipathparam id An OpenEHR ArchetypeID value.
   [type=string,required,single,default=openEHR-EHR-OBSERVATION.blood_pressure.v1]

 */
public class ArchetypeResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     * @param id An OpenEHR ArchetypeID value
     */
    public ArchetypeResource(
        final ClientResourceConfig config_,
        final String id
    )
    {
        super(null, config_, "/archetype/" + id);
    }

    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param client_ The client to use for making the connection.
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     * @param id An OpenEHR ArchetypeID value
     */
    public ArchetypeResource(
        final Client client_,
        final ClientResourceConfig config_,
        final String id
    )
    {
        super(client_, config_, "/archetype/" + id);
    }

    /**
       Retrieve archetype resource.

Retrieve an archetype encapsulated in JSON.



       <p>
       Use the {@link #getArchetype(ArchetypeResourceGetArchetypeParams)}
       method to pass additional query arguments.</p>


       

     */
    public com.medvision360.medrecord.api.archetype.ArchetypeResult getArchetype(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return getArchetype(
        null
      );
    }

    /**
       Retrieve archetype resource.

Retrieve an archetype encapsulated in JSON.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public com.medvision360.medrecord.api.archetype.ArchetypeResult getArchetype(
        final ArchetypeResourceGetArchetypeParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        try
        {
            final ClientResource resource_ = getClientResource();
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeResource.class);
            return wrapped_.getArchetype(
            );
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = getErrorDocument();
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ParseException(errorDocument_.getArguments());
                    case "INVALID_ARCHETYPE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

    /**
       Retrieve archetype resource.

Retrieve an archetype as an ADL string (plain text).



       <p>
       Use the {@link #getArchetypeAsText(ArchetypeResourceGetArchetypeAsTextParams)}
       method to pass additional query arguments.</p>


       @apiacceptvariant getArchetype



     */
    public java.lang.String getArchetypeAsText(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return getArchetypeAsText(
        null
      );
    }

    /**
       Retrieve archetype resource.

Retrieve an archetype as an ADL string (plain text).



       @param queryParams_ The query parameters to be added to the request.

       @apiacceptvariant getArchetype


     */
    public java.lang.String getArchetypeAsText(
        final ArchetypeResourceGetArchetypeAsTextParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        try
        {
            final ClientResource resource_ = getClientResource();
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeResource.class);
            return wrapped_.getArchetypeAsText(
            );
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = getErrorDocument();
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ParseException(errorDocument_.getArguments());
                    case "INVALID_ARCHETYPE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

    /**
       Delete archetype resource.

Delete a stored archetype.



       <p>
       Use the {@link #deleteArchetype(ArchetypeResourceDeleteArchetypeParams)}
       method to pass additional query arguments.</p>


       

     */
    public void deleteArchetype(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InUseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      deleteArchetype(
        null
      );
    }

    /**
       Delete archetype resource.

Delete a stored archetype.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void deleteArchetype(
        final ArchetypeResourceDeleteArchetypeParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InUseException,
        com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        try
        {
            final ClientResource resource_ = getClientResource();
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.archetype.ArchetypeResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.archetype.ArchetypeResource.class);
            wrapped_.deleteArchetype(
            );
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = getErrorDocument();
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "IN_USE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InUseException(errorDocument_.getArguments());
                    case "INVALID_ARCHETYPE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidArchetypeIDException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

}
