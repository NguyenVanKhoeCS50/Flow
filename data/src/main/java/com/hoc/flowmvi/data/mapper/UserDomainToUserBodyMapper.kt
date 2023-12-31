package com.hoc.flowmvi.data.mapper

import com.hoc.flowmvi.core.Mapper
import com.hoc.flowmvi.data.remote.UserBody
import com.hoc.flowmvi.domain.model.User

internal class UserDomainToUserBodyMapper : Mapper<User, UserBody> {
  override fun invoke(domain: User): UserBody =
    UserBody(
      email = domain.email.value,
      firstName = domain.firstName.value,
      lastName = domain.lastName.value,
    )
}
